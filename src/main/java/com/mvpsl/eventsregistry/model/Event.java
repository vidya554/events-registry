package com.mvpsl.eventsregistry.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private LocalDate eventdate;
    private String address;

    @OneToMany
    @JoinColumn(name = "event_id")
    private List<Participant> participantList;
}
