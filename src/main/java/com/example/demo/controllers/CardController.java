package com.example.demo.controllers;

import com.example.demo.services.CardService;
import com.example.demo.models.Card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    public void addCard(Card card) {
        cardService.addCard(card);
    }
}