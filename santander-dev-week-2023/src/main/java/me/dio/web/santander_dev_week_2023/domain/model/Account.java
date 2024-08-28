package me.dio.web.santander_dev_week_2023.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(scale = 13, precision = 2)
    private BigDecimal balance;

    @Column(name = "account_limit", scale = 13, precision = 2)
    private BigDecimal limit;

}
