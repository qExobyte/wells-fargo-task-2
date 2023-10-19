package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int riskLevel;

    @Column(nullable = false)
    @ManyToOne
    Client client;

    protected Portfolio() {

    }

    public Portfolio(String firstName, String lastName, int riskLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.riskLevel = riskLevel;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(int riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Long getClientId() {
        return client.getClientId();
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
