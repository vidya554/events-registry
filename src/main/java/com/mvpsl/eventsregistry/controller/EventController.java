package com.mvpsl.eventsregistry.controller;

import com.mvpsl.eventsregistry.model.Event;
import com.mvpsl.eventsregistry.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping(value = "/")
    public String home(){
        return "Welcome Home";
    }

    public Event createEvent(Event event) {


        return event;
    }
}
