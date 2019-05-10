package com.mvpsl.eventsregistry.service;

import com.mvpsl.eventsregistry.model.Participant;
import com.mvpsl.eventsregistry.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {
    @Autowired
    ParticipantRepository participantRepository;
    public void addParticipant(Participant participant) {
        participantRepository.save(participant);
    }

    public List<Participant> getPaticipants() {
        return participantRepository.findAll();
    }
}
