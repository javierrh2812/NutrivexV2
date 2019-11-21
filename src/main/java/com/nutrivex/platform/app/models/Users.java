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


@Entity
@Table(name="users")
public class Users implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30, unique = true)
	private String username;
	
	/*@NotEmpty
	private String email;*/
	
	@Column(length = 60)
	private String password;
	
	private Boolean enabled;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="person_id")
	private Person person;
	
	@OneToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="role_id")
	private Role role;
	
	/*@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="credit_card_id")
	private CreditCard creditCard;*/
	
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
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}*/

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

	/*public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}*/


	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}





	
}
