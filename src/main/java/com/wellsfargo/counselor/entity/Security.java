package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private int purchaseDate; // in SQL this would be DATE

    @Column(nullable = false)
    @ManyToOne
    Portfolio portfolio;

    protected Security() {

    }

    public Security(String type, int quantity, float price, int purchaseDate) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.purchaseDate = purchaseDate;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getPortfolioId() {
        return portfolio.getPortfolioId();
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}