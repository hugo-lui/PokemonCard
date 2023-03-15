package com.example.demo.repositories;

import com.example.demo.models.Card;
import java.util.UUID;
import java.util.List;

public interface CardRepository {
    int addCard(UUID id, Card card);

    default int addCard(Card card) {
        UUID id = UUID.randomUUID();
        return addCard(id, card);
    }

    List<Card> allCards();
}