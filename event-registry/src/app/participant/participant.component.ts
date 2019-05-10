import { Component, OnInit } from '@angular/core';
import {Participant} from '../participant';

@Component({
  selector: 'app-participant',
  templateUrl: './participant.component.html',
  styleUrls: ['./participant.component.css']
})
export class ParticipantComponent implements OnInit {
  name: string;
  email: string;
  phone: string;
  participant: Participant;
  constructor() { }

  ngOnInit() {
  }

}
