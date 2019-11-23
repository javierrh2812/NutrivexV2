package com.nutrivex.platform.app.models;

import java.io.Serializable;
//import java.util.List;

import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

//import lombok.Data;

@Entity
@Table(name="recipes")
public @Data class Recipe implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String name;
	
	private String description;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne
	@JoinColumn(name="nutritionist_id")
	private User nutritionist;
	
	/*/LISTA DE ALIMENTOS DE LA RECETA
	//@JoinTable(
	        name = "recipes_foods",
	        joinColumns = @JoinColumn(name = "recipe_id", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="food_id", nullable = false)
	)
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Food> foods;*/

	private static final long serialVersionUID = 1L;
	
	

}
