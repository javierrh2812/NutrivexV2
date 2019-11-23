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
public @Data class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String username;
<<<<<<< HEAD
	
	//@NotEmpty
	//private String email;
=======
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708
	
	@NotEmpty
	private String password;
	
	//ROL DEL USUARIO
	@OneToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="role_id")
	private Role role;
	
<<<<<<< HEAD
	/*@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="credit_card_id")
	private CreditCard creditCard;*/
	
	/*PUBLIC METHODS */
=======
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708
	@Override
	public String toString() {
		return username;
	}
	
<<<<<<< HEAD
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




	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}




=======
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708
	private static final long serialVersionUID = 1L;

}
