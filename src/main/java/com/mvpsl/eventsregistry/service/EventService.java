package com.mvpsl.eventsregistry.service;


import com.mvpsl.eventsregistry.model.Event;
import com.mvpsl.eventsregistry.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;

    public Event createEvent(Event event) {
      return   eventRepository.save(event);
    }
}
