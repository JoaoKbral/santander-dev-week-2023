package me.dio.web.santander_dev_week_2023.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "card_limit", scale = 13, precision = 2)
    private BigDecimal limit;
}
