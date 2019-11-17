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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="templates")
public class Template implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user; 
	
	@JoinTable(
	        name = "templates_recipes",
	        joinColumns = @JoinColumn(name = "template_id", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="recipe_id", nullable = false)
	)
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Recipe> recipes;
	
	
	
	public Template(Long id, String name, String description, List<Recipe> recipes) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.recipes = recipes;	
	}
	
	
	
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
	

	/**
	 * @return the recipes
	 */
	public List<Recipe> getRecipes() {
		return recipes;
	}
	/**
	 * @param recipes the recipes to set
	 */
	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
