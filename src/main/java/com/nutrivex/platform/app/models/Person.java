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

	private static final long serialVersionUID = 1L;

}
