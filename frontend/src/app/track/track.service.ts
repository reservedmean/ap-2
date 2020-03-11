import {Injectable, OnDestroy} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Track} from './track';
import {BehaviorSubject, interval, Observable, TimeInterval} from 'rxjs';
import {debounce} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class TrackService implements OnDestroy {

  private trackList$: BehaviorSubject<Track[]> = new BehaviorSubject<Track[]>([]);
  private trackFetchInterval;

  constructor(private httpClient: HttpClient) {
    this.fetchTracks();
    this.trackFetchInterval = setInterval(() => this.fetchTracks(), 1000);
  }

  private fetchTracks(): void {
    this.httpClient.get<Track[]>('http://localhost:8080/track').subscribe(
      data => this.trackList$.next(data)
    );
  }

  findAll(): Observable<Track[]> {
    return this.trackList$.asObservable();
  }

  updateCurrentTracks(): Observable<Track[]> {
    this.fetchTracks();
    return this.findAll();
  }

  ngOnDestroy(): void {
    clearInterval(this.trackFetchInterval);
  }
}
