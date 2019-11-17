package com.nutrivex.platform.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="requests")
public class Request implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String message;	
	private Date date;	
	private Boolean acepted;
	
	@OneToOne
	@JoinColumn(name="patient_id")
	private Users patient;
	
	@OneToOne
	@JoinColumn(name="nutritionist_id")
	private Users nutritionist;
	
	public Request() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Users getPatient() {
		return patient;
	}
	public void setPatient(Users patient) {
		this.patient = patient;
	}
	public Users getNutritionist() {
		return nutritionist;
	}
	public void setNutritionist(Users nutritionist) {
		this.nutritionist = nutritionist;
	}


	public Boolean getAcepted() {
		return acepted;
	}
	public void setAcepted(Boolean acepted) {
		this.acepted = acepted;
	}


	private static final long serialVersionUID = 1L;
	

}