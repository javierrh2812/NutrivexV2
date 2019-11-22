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
	
	@Override
	public String toString() {
		return person.getFirstName()+" "+person.getLastName();
	}
	

	private static final long serialVersionUID = 1L;

}
