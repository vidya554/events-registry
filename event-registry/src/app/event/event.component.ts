import { Component, OnInit } from '@angular/core';
import { Event } from '../event'
import {EVENTS} from   '../mock-event';
@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit {
  events = EVENTS;
  constructor() { }

  ngOnInit() {
  }


  
  



}
