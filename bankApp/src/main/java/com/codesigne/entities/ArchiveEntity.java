package com.codesigne.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "archive")
public class ArchiveEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String archiveId;

    @Column(nullable = false, name = "id_sender")
    private String idSender;

    @Column(nullable = false, name = "id_recipient")
    private String idRecipient;

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

    public String getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

//    public TransactionEntity getTransactionEntity() {
//        return transactionEntity;
//    }
//
//    public void setTransactionEntity(TransactionEntity transactionEntity) {
//        this.transactionEntity = transactionEntity;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArchiveEntity that)) return false;
        return id == that.id && Double.compare(that.money, money) == 0 && Objects.equals(archiveId, that.archiveId) && Objects.equals(idSender, that.idSender) && Objects.equals(idRecipient, that.idRecipient) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, archiveId, idSender, idRecipient, money, date);
    }
}
