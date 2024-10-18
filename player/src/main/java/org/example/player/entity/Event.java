package org.example.player.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data

public class Event implements Serializable {
    private Long id;
    private String description;
    private boolean isOngoing;
    private Map<String, Integer> resourceImpact;

    public Event(){

    }
}
