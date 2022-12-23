package com.codesigne.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "transaction")
public class TransactionEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String transactionId;

    @Column(nullable = false,name = "id_recipient")
    private String idDestinataire;

    @Column(nullable = false)
    private double money;

    @Column(nullable = false)
    private LocalDateTime date;

    @Column(nullable = false)
    private String status;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private UserEntity userEntity;
//
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private AgentEntity agentEntity;
//
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private ArchiveEntity archiveEntity;
//
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private AccountEntity accountEntity;

    //getters and setters =============================================================
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdDestinataire() {
        return idDestinataire;
    }

    public void setIdDestinataire(String idDestinataire) {
        this.idDestinataire = idDestinataire;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
//
//    public UserEntity getUserEntity() {
//        return userEntity;
//    }
//
//    public void setUserEntity(UserEntity userEntity) {
//        this.userEntity = userEntity;
//    }
//
//    public AgentEntity getAgentEntity() {
//        return agentEntity;
//    }
//
//    public void setAgentEntity(AgentEntity agentEntity) {
//        this.agentEntity = agentEntity;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionEntity that)) return false;
        return id == that.id && Double.compare(that.money, money) == 0 && Objects.equals(transactionId, that.transactionId) && Objects.equals(idDestinataire, that.idDestinataire) && Objects.equals(date, that.date) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transactionId, idDestinataire, money, date, status);
    }
}
