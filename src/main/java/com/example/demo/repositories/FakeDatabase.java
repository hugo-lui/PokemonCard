package com.example.demo.repositories;

import com.example.demo.models.Card;
import java.util.UUID;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository("database")
public class FakeDatabase implements CardRepository {
    private static List<Card> database = new ArrayList<>();

    @Override
    public int addCard(UUID id, Card card) {
        database.add(new Card(id, card.getHealth(), card.getLevel(), card.getName(), card.getAttack()));
        return 1;
    }

    @Override
    public List<Card> getAllCards() {
        return database;
    }

    @Override
    public Optional<Card> getCardById(UUID id) {
        return database.stream().filter(card -> card.getId().equals(id)).findFirst();
    }  

    @Override
    public int deleteCardById(UUID id) {
        Optional<Card> cardOptional = getCardById(id);
        if(cardOptional.isEmpty()) {
            return 0;
        }
        database.remove(cardOptional.get());
        return 1;
    }

    @Override
    public int updateCardById(UUID id, Card card) {
        return getCardById(id).map(c -> {
            if(database.indexOf(c) != -1) {
                database.set(database.indexOf(c), new Card(id, c.getHealth(), c.getLevel(), c.getName(), c.getAttack()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}