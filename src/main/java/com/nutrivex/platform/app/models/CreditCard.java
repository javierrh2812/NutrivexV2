package com.nutrivex.platform.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit_cards")
public class CreditCard implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String cardNumber;
	
	private Date dueDate;
	
	private Long securityCode;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getCardNumber() {
		return cardNumber;
	}




	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}




	public Date getDueDate() {
		return dueDate;
	}




	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}




	public Long getSecurityCode() {
		return securityCode;
	}




	public void setSecurityCode(Long securityCode) {
		this.securityCode = securityCode;
	}

	private static final long serialVersionUID = 1L;

}
