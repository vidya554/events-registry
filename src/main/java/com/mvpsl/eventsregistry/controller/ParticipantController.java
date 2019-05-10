package com.mvpsl.eventsregistry.controller;

import com.mvpsl.eventsregistry.model.Participant;
import com.mvpsl.eventsregistry.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParticipantController {

    @Autowired
    ParticipantService participantService;

    @PostMapping("/addparticipant")
    public ResponseEntity<Participant> addparticipant(@RequestBody Participant participant){
        participantService.addParticipant(participant);
        return new ResponseEntity<>(participant, HttpStatus.OK);
    }


    @GetMapping(value = "all")
    public ResponseEntity<List<Participant>> getParticipants(){

        return new ResponseEntity<>(participantService.getPaticipants(), HttpStatus.OK);
    }
}
