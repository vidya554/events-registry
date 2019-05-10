import { Component, OnInit } from '@angular/core';
import {Participant} from '../participant';
import { PARTICIPANTS } from '../mock-participant';


@Component({
  selector: 'app-participant',
  templateUrl: './participant.component.html',
  styleUrls: ['./participant.component.css']
})
export class ParticipantComponent implements OnInit {
  
  participants =  PARTICIPANTS;
  constructor() { }

  ngOnInit() {
  }

}
