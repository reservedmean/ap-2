import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TrackListComponent} from './track-list-page/track-list.component';


const routes: Routes = [
  {path: 'tracks', component: TrackListComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PlaylistRoutingModule { }
