package com.codesigne.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8270534841723146218L;
	private long id;
	private String userId;
	private String firstname;
	private String lastname;
	private String adress;
	private String email;
	private String phone;
	private Double money;
	private String typecompte;
	private String status;
	private String password;
	private String encryptedPassword;
	private String emailVerificationToken;
	private Boolean emailVerificationStatus = false;
	
	//getters and setters ======================================
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	
}
