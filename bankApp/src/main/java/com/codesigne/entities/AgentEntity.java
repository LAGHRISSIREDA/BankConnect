package com.codesigne.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity(name = "agent")
public class AgentEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -4735836398504946340L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String agentId;

    @Column(nullable = false, length = 50)
    private String firstname;

    @Column(nullable = false, length = 50)
    private String lastname;

    @Column(nullable = false, length = 200, unique = true)
    private String email;

    @Column(nullable = false, length = 50)
    private String encryptedPassword;

    @Column(nullable = true)
    private String emailVerificationToken;

    @Column(nullable = false)
    private Boolean emailVerificationStatus = false;

//    @OneToMany(mappedBy = "agentEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<TransactionEntity> transactionEntities;

    //getters and setters =============================================================

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }

    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }

    public Boolean getEmailVerificationStatus() {
        return emailVerificationStatus;
    }

    public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
    }

//    public List<TransactionEntity> getTransactionEntities() {
//        return transactionEntities;
//    }
//
//    public void setTransactionEntities(List<TransactionEntity> transactionEntities) {
//        this.transactionEntities = transactionEntities;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AgentEntity that)) return false;
        return id == that.id && Objects.equals(agentId, that.agentId) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(email, that.email) && Objects.equals(encryptedPassword, that.encryptedPassword) && Objects.equals(emailVerificationToken, that.emailVerificationToken) && Objects.equals(emailVerificationStatus, that.emailVerificationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agentId, firstname, lastname, email, encryptedPassword, emailVerificationToken, emailVerificationStatus);
    }
}
