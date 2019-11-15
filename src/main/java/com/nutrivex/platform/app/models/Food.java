package com.nutrivex.platform.app.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="foods")
public class Food implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String type;
	
	@NotEmpty
	private String portion;
	
	@NotEmpty
	private Double proteins;
	
	@NotEmpty
	private Double carbs;
	
	@NotEmpty
	private Double calories;
	
	//NO ES NECESARIO TENER ESTE ATRIBUTO GREGORINI XD
	/*
	@JoinTable(
	        name = "recipes_foods",
	        joinColumns = @JoinColumn(name = "food_id", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="recipe_id", nullable = false)
	)
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Recipe> recipes;
	*/
	/**
	 * 
	 */

	/**/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPortion() {
		return portion;
	}
	public void setPortion(String portion) {
		this.portion = portion;
	}
	public Double getProteins() {
		return proteins;
	}
	public void setProteins(Double proteins) {
		this.proteins = proteins;
	}
	public Double getCarbs() {
		return carbs;
	}
	public void setCarbs(Double carbs) {
		this.carbs = carbs;
	}
	public Double getCalories() {
		return calories;
	}
	public void setCalories(Double calories) {
		this.calories = calories;
	}
	private static final long serialVersionUID = 1L;
	

}
