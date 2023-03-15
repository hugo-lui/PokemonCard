package com.example.demo.services;

import com.example.demo.repositories.CardRepository;
import com.example.demo.models.Card;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    private final CardRepository cardRepository;

    @Autowired
    public CardService(@Qualifier("database") CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public int addCard(Card card) {
        return cardRepository.addCard(card);
    }

    public List<Card> getAllCards() {
        return cardRepository.allCards();
    }
}