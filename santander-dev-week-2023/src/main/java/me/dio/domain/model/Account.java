package me.dio.domain.model;

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

    @Column(scale = 2, precision = 13)
    private BigDecimal balance;

    @Column(name = "account_limit", scale = 2, precision = 13)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }
}
