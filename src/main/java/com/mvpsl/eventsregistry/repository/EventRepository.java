package com.mvpsl.eventsregistry.repository;

import com.mvpsl.eventsregistry.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
