package com.example.demo.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Card {
    private UUID id;
    private Integer health;
    private Integer level;
    private String name;
    private String attack;

    public Card(@JsonProperty("id") UUID id, @JsonProperty("health") Integer health, @JsonProperty("level") Integer level, @JsonProperty("name") String name, @JsonProperty("attack") String attack) {
        this.id = id;
        this.health = health;
        this.level = level;
        this.name = name;
        this.attack = attack;
    }

    public UUID getId() {
        return this.id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getHealth() {
        return this.health;
    }
    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getLevel() {
        return this.level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAttack() {
        return this.attack;
    }
    public void setAttack(String attack) {
        this.attack = attack;
    }
}