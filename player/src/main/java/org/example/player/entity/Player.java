package org.example.player.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Map;
@Entity
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ElementCollection
    private Map<String, Integer> inventory;

    private boolean isAlive;

    private int health = 100;

    public Player() {
        this.isAlive = true;
    }
}
