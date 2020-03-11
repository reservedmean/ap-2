import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Track} from './track';
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class TrackService {
  constructor(private httpClient: HttpClient) {}

  findAll(): Observable<Track[]> {
    return this.httpClient.get<Track[]>('http://localhost:8080/url');
  }
}
