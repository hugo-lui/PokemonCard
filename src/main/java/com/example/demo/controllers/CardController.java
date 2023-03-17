package com.example.demo.controllers;

import com.example.demo.services.CardService;
import com.example.demo.models.Card;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/cards")
    public List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    @GetMapping("/cards/{id}")
    public Card getCardById(@PathVariable("id") UUID id) {
        return cardService.getCardById(id).orElse(null);
    }

    @PostMapping("/newCard")
    public void addCard(@RequestBody Card card) {
        cardService.addCard(card);
    }

    @DeleteMapping("/cards/{id}")
    public void deleteCardById(@PathVariable("id") UUID id) {
        cardService.deleteCardById(id);
    }

    @PutMapping("/cards/{id}")
    public void updateCardById(@PathVariable("id") UUID id, @RequestBody Card card) {
        cardService.updateCardById(id, card);
    }
}