package com.codesigne.responses;

public class ArchiveResponse {

    private String idArchive;

    private String idSender;

    private String idRecipient;

    private double money;

    private String date;

    public String getIdArchive() {
        return idArchive;
    }

    public void setIdArchive(String idArchive) {
        this.idArchive = idArchive;
    }

    public String getIdSender() {
        return idSender;
    }

    public void setIdSender(String idSender) {
        this.idSender = idSender;
    }

    public String getIdRecipient() {
        return idRecipient;
    }

    public void setIdRecipient(String idRecipient) {
        this.idRecipient = idRecipient;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
