package com.codesigne.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name = "archive")
public class ArchiveEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String archiveId;

    @Column(nullable = false, name = "id_sender")
    private String idDestinateure;

    @Column(nullable = false, name = "id_recipient")
    private String IdDestinataire;

    @Column(nullable = false)
    private double money;

    @Column(nullable = false)
    private LocalDateTime date;

//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private TransactionEntity transactionEntity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdDestinateure() {
        return idDestinateure;
    }

    public void setIdDestinateure(String idDestinateure) {
        this.idDestinateure = idDestinateure;
    }

    public String getIdDestinataire() {
        return IdDestinataire;
    }

    public void setIdDestinataire(String idDestinataire) {
        IdDestinataire = idDestinataire;
    }

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

}
