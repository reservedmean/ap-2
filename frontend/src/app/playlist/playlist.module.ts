import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {PlaylistRoutingModule} from './playlist-routing.module';
import {TrackListComponent} from './track-list-page/track-list.component';
import {TrackModule} from '../track/track.module';

@NgModule({
  declarations: [
    TrackListComponent
  ],
  exports: [
    TrackListComponent
  ],
  imports: [
    CommonModule,
    PlaylistRoutingModule,
    TrackModule
  ]
})
export class PlaylistModule { }
