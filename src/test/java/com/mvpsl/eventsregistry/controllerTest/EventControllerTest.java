package com.mvpsl.eventsregistry.controllerTest;


import com.mvpsl.eventsregistry.controller.EventController;
import com.mvpsl.eventsregistry.model.Event;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@WebMvcTest(EventController.class)
public class EventControllerTest {

    Event event;
    @Autowired
    EventController eventController;

    @Before
    public void setup(){
        event = new Event();
        event.setId(1);
        event.setName("birthday");
        event.setAddress("Charlotte");
        event.setEventdate(LocalDate.of(2019, 5, 23));

    }


    @Test
    public void setEvent() {

      Event  actual =  eventController.createEvent(event);

        assertEquals(event, actual);
    }
}
