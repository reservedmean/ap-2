import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {TrackService} from './track.service';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [],
  providers: [
    TrackService
  ],
  imports: [
    CommonModule,
    HttpClientModule
  ]
})
export class TrackModule { }
