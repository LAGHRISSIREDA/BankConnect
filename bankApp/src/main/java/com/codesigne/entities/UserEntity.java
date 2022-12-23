package com.codesigne.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity(name = "users")
public class UserEntity implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = -4735836398504946340L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String userId;

	@Column(nullable = false,length = 50)
	private String firstname;

	@Column(nullable = false,length = 50)
	private String lastname;

	@Column(nullable = false,length = 200)
	private String adress;

	@Column(nullable = false,length = 120,unique = true)
	private String email;

	@Column(nullable = false,length = 50)
	private String phone;

	@Column(nullable = false)
	private Double money;

	@Column(nullable = false,length = 50)
	private String typecompte;

	@Column(nullable = false,length = 50)
	private String status;

	@Column(nullable = false)
	private String encryptedPassword;

	@Column(nullable = true)
	private String emailVerificationToken;

	@Column(nullable = false)
	private Boolean emailVerificationStatus = false;


	//getters and setters =============================================================

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}





}
