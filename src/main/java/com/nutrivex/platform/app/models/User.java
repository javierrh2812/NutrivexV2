package com.nutrivex.platform.app.models;

import java.io.Serializable;
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
@Table(name="users")
public @Data class  User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@NotEmpty
	//private String email;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String password;
	
	
	//PERSONA ASOCIADA AL USUARIO
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="person_id")
	private Person person;
	
	//ROL DEL USUARIO
	@OneToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="role_id")
	private Role role;
	
	//TARJETA DE CREDITO DEL USUARIO
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="credit_card_id")
	private CreditCard creditCard;
	
	
	//EN EL CASO QUE TENGA ROL NUTRICIONISTA
	/*
	@OneToMany(mappedBy = "nutritionist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Template> templates;
	
	@OneToMany(mappedBy = "nutritionist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<NutritionPlan> nutritionPlans;
	
	@OneToMany(mappedBy = "nutritionist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Recipe> recipes;
	
	
	//EN EL CASO QUE SEA PACIENTE
	@OneToOne(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private NutritionPlan nutritionPlan;
	*/
	/*PUBLIC METHODS */
	@Override
	public String toString() {
		return person.getFirstName()+" "+person.getLastName();
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}





	private static final long serialVersionUID = 1L;

}
