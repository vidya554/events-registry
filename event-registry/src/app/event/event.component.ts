import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit {
  eventName: String = "Vidya's BirthDay";
  eventDate:  Date; 
  eventVenue: String = "Charlotte NC";
  constructor() { }

  ngOnInit() {
  }

}
