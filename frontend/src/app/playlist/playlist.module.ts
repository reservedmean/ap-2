import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {PlaylistRoutingModule} from './playlist-routing.module';
import {TrackListComponent} from './track-list-page/track-list.component';

@NgModule({
  declarations: [
    TrackListComponent
  ],
  imports: [
    CommonModule,
    PlaylistRoutingModule
  ]
})
export class PlaylistModule { }
