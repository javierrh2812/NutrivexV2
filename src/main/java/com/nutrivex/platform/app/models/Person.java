package com.nutrivex.platform.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name="people")
public @Data class Person implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Column(name="first_name")
	private String firstName;
	
	@NotEmpty
	@Column(name="last_name")
	private String lastName;
	
	@Column(name = "weight")
	private Float weight;
	
	@Column(name = "height")
	private Float height;
	
	@Column(name = "sex")
	private String sex;
	
<<<<<<< HEAD
	@Column(name="credit_Card")
	private String creditCard;
	
=======

>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708
	@Column(name="nutritionist_specialty")
	private String nutritionistSpecialty;

	@Column(name="tuition_number")
	private String tuitionNumber;
	
	//PERSONA ASOCIADA AL USUARIO
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
<<<<<<< HEAD
	
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

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	

	public String getTuitionNumber() {
		return tuitionNumber;
	}

	public void setTuitionNumber(String tuitionNumber) {
		this.tuitionNumber = tuitionNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getNutritionistSpecialty() {
		return nutritionistSpecialty;
	}
	public void setNutritionistSpecialty(String nutritionistSpecialty) {
		this.nutritionistSpecialty = nutritionistSpecialty;
	}

	
	
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}


=======
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708

	private static final long serialVersionUID = 1L;

}
