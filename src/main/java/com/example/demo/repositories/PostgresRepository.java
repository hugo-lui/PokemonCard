package com.example.demo.repositories;

import com.example.demo.models.Card;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("postgres")
public class PostgresRepository implements CardRepository {
    private final JdbcTemplate template;

    @Autowired
    public PostgresRepository(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public int addCard(UUID id, Card card) {
        return 0;
    }

    @Override
    public List<Card> getAllCards() {
        return template.query("select * from cards", (result, i) -> {
            return new Card(UUID.fromString(result.getString("id")), Integer.parseInt(result.getString("health")), Integer.parseInt(result.getString("level")), result.getString("name"), result.getString("attack"));
        });
    }

    @Override
    public Optional<Card> getCardById(UUID id) {
        Card card = template.queryForObject("select * from cards where id = ?", new Object[]{id}, (result, i) -> {
            return new Card(UUID.fromString(result.getString("id")), Integer.parseInt(result.getString("health")), Integer.parseInt(result.getString("level")), result.getString("name"), result.getString("attack"));
        });
        return Optional.ofNullable(card);
    }

    @Override
    public int deleteCardById(UUID id) {
        return 0;
    }

    @Override
    public int updateCardById(UUID id, Card card) {
        return 0;
    }
}