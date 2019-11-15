package com.nutrivex.platform.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	
	//LISTA DE ALIMENTOS DE LA RECETA
	@JoinTable(
	        name = "recipes_foods",
	        joinColumns = @JoinColumn(name = "recipe_id", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="food_id", nullable = false)
	)
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Food> foods;
	
	//PLANES A LOS QUE PERTENECE LA RECETA
	//ESTE ATRIBUTO NO ES NECESARIO GREGORINI
	/*@OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
	private List<NutritionPlanRecipe> nutritionPlanRecipe;*/
	
	//TEMPLATES A LOS QUE PERTENECE LA RECETA
	@ManyToMany(mappedBy="recipes", fetch = FetchType.LAZY)
	private List<Template> templates;

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
	
	public List<Food> getFoods() {
		return foods;
	}
	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
	
	public List<Template> getTemplates() {
		return templates;
	}
	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	private static final long serialVersionUID = 1L;
	
	

}
