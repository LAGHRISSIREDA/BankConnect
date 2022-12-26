package com.codesigne.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserRequest {
	
	@NotNull(message = "Ce champ ne doit etre null!")
	@Size(min=3)
	private String firstname;
	
	@NotBlank
	@Size(min=3)
	private String lastname;
	
	@NotNull
	@Size(min=6)
	private String adress;
	
	@Email
	private String email;
	private String phone;
	private Double money;
	private String typecompte;
	private String status;
	
	@NotNull
	@Size(min=6,max=12)
	@Pattern(regexp = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$",message = "password doit contenir majuscule minuscule number ..")
	private String password;
	
	//getters and setters==================================================
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTypecompte() {
		return typecompte;
	}
	public void setTypecompte(String typecompte) {
		this.typecompte = typecompte;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
