import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EventComponent } from './event/event.component';
import { ParticipantComponent } from './participant/participant.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule, MatCheckboxModule} from '@angular/material';
import { ReactiveFormsModule } from '@angular/forms';
import { RegisterComponent } from './register/register.component';
@NgModule({
   declarations: [
      AppComponent,
      EventComponent,
      ParticipantComponent,
      RegisterComponent
   ],
   imports: [
      BrowserModule,
      AppRoutingModule,
      NoopAnimationsModule,
      MatButtonModule, 
      MatCheckboxModule,
      ReactiveFormsModule,
   ],
   exports: [MatButtonModule, MatCheckboxModule],
   providers: [],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
