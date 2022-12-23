package com.codesigne.responses;

import java.time.LocalDateTime;

public class TransactionResponse {

    private String transactionId;

    private String idDestinataire;

    private double money;

    private LocalDateTime date;

    private String status;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getIdDestinataire() {
        return idDestinataire;
    }

    public void setIdDestinataire(String idDestinataire) {
        this.idDestinataire = idDestinataire;
    }

    public double getMooney() {
        return money;
    }

    public void setMooney(double money) {
        this.money = money;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
