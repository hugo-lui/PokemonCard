package com.example.demo.repositories;

import com.example.demo.models.Card;
import java.util.UUID;
import java.util.List;
import java.util.Optional;

public interface CardRepository {
    int addCard(UUID id, Card card);

    default int addCard(Card card) {
        UUID id = UUID.randomUUID();
        return addCard(id, card);
    }

    List<Card> getAllCards();

    Optional<Card> getCardById(UUID id);

    int deleteCardById(UUID id);

    int updateCardById(UUID id, Card card);
}