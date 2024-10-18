package org.example.event.service;

import org.example.event.entity.Event;
import org.example.event.messaging.EventServicePublisher;
import org.example.event.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final EventServicePublisher eventServicePublisher;

    public EventService(EventRepository eventRepository, EventServicePublisher eventServicePublisher) {
        this.eventRepository = eventRepository;
        this.eventServicePublisher = eventServicePublisher;
    }

    public Event createEvent(Event event) {
        Event createdEvent = eventRepository.save(event);
        eventServicePublisher.sendEventMessage(createdEvent);
        return eventRepository.save(event);
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
    public Event updateEvent(Long id, Event event) {
        return eventRepository.save(event);
    }
    public void endEvent(Long id) {
        eventRepository.delete(getEventById(id));
    }
}
