package com.nutrivex.platform.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="recipes")
public class Recipe implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String description;
	
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

<<<<<<< HEAD


	public List<FoodRecipe> getItems() {
		return items;
	}



	public void setItems(List<FoodRecipe> items) {
		this.items = items;
	}
=======
>>>>>>> origin/Franco



	public List<NutritionPlanRecipe> getNutritionPlanRecipe() {
		return nutritionPlanRecipe;
	}



	public void setNutritionPlanRecipe(List<NutritionPlanRecipe> nutritionPlanRecipe) {
		this.nutritionPlanRecipe = nutritionPlanRecipe;
	}



	private static final long serialVersionUID = 1L;
	
	

}
