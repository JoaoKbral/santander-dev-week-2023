package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "card_limit", scale = 2, precision = 13)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getLimit() {
        return limit;
    }
}
