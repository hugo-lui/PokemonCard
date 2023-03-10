package com.example.demo.repositories;

import com.example.demo.models.Card;
import java.util.UUID;

public interface CardRepository {
    int addCard(UUID id, Card card);

    default int addCard(Card card) {
        UUID id = UUID.randomUUID();
        return addCard(id, card);
    }
}