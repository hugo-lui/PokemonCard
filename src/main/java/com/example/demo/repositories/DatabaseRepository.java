package com.example.demo.repositories;

import com.example.demo.models.Card;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository("database")
public class DatabaseRepository implements CardRepository {
    private static List<Card> database = new ArrayList<>();

    @Override
    public int addCard(UUID id, Card card) {
        database.add(new Card(id, card.getHealth(), card.getLevel(), card.getName(), card.getAttack()));
        return 1;
    }

    @Override
    public List<Card> allCards() {
        return database;
    }  
}