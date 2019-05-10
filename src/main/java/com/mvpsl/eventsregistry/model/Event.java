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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEventdate() {
        return eventdate;
    }

    public void setEventdate(LocalDate eventdate) {
        this.eventdate = eventdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
