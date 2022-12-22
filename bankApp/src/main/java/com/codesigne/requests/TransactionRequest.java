package com.codesigne.requests;

import java.time.LocalDateTime;

public class TransactionRequest {

    private double money;
    private LocalDateTime date;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
