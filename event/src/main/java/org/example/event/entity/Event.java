package org.example.event.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Map;

@Entity
@Data
public class Event {

    //Generationtype.identity -> Tells jpa to use database auto-increment on ids.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private boolean isOngoing;

    @ElementCollection
    private Map<String, Integer> resourceImpact; // impact on supplies
}
