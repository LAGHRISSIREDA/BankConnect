package com.codesigne.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "account")
public class AccountEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -4735836398504946340L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String accountNumber;

    @Column(nullable = false, length = 50)
    private String firstname;

    @Column(nullable = false, length = 50)
    private String lastname;

    @Column(nullable = false, length = 200)
    private String adress;

    @Column(nullable = false, length = 120, unique = true)
    private String email;

    @Column(nullable = false, length = 50)
    private String phone;

    @Column(nullable = false)
    private Double money;

    @Column(nullable = false)
    private String encryptedPassword;

    @Column(nullable = false, length = 50)
    private String typecompte;


//    @OneToMany(mappedBy = "accountEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<TransactionEntity> transactionEntities;
//
//    @OneToOne(mappedBy = "accountEntity", cascade = CascadeType.ALL)
//    private UserEntity userEntity;


    //getters and setters =============================================================


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getTypecompte() {
        return typecompte;
    }

    public void setTypecompte(String typecompte) {
        this.typecompte = typecompte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountEntity that)) return false;
        return id == that.id && Objects.equals(userId, that.userId) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(adress, that.adress) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(money, that.money) && Objects.equals(typecompte, that.typecompte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, firstname, lastname, adress, email, phone, money, typecompte);
    }
}
