package com.example.demo.repositories;

import com.example.demo.models.Card;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository("postgres")
public class PostgresRepository implements CardRepository {

    @Override
    public int addCard(UUID id, Card card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCard'");
    }

    @Override
    public List<Card> getAllCards() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCards'");
    }

    @Override
    public Optional<Card> getCardById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCardById'");
    }

    @Override
    public int deleteCardById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCardById'");
    }

    @Override
    public int updateCardById(UUID id, Card card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCardById'");
    }
    
}