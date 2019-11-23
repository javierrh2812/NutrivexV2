package com.nutrivex.platform.app.models;

import java.io.Serializable;
//import java.util.List;

import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
<<<<<<< HEAD
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
=======
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708
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
	
<<<<<<< HEAD
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "food_id")
	private Food food;
	
	@OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
	private List<NutritionPlanRecipe> nutritionPlanRecipe;
	
	

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



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}





	public List<NutritionPlanRecipe> getNutritionPlanRecipe() {
		return nutritionPlanRecipe;
	}



	public void setNutritionPlanRecipe(List<NutritionPlanRecipe> nutritionPlanRecipe) {
		this.nutritionPlanRecipe = nutritionPlanRecipe;
	}


=======
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
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708

	private static final long serialVersionUID = 1L;
	
	

}
