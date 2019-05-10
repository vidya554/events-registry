import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
 registerForm = new FormGroup({
   name:new FormControl(''),
   phone:new FormControl(''),
   email: new FormControl(''),
 });
 
  constructor(private fb: FormBuilder) { }

  ngOnInit() {
 
  }

}
