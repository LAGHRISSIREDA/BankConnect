package com.codesigne.requests;

import java.time.LocalDateTime;

public class TransactionRequest {

    private double money;
    private LocalDateTime date;
    private String idDestinataire;

    //getters and setters ==================================================

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getIdDestinataire() {
        return idDestinataire;
    }

    public void setIdDestinataire(String idDestinataire) {
        this.idDestinataire = idDestinataire;
    }


}
