package com.codesigne.requests;

import java.time.LocalDateTime;

public class ArchiveRequest {

    private double montant;

    private LocalDateTime date;


    //getters and setters ==================================================

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}


