package com.mvpsl.eventsregistry.repository;

import com.mvpsl.eventsregistry.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
