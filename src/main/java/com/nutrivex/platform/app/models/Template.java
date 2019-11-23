package com.nutrivex.platform.app.models;

import java.io.Serializable;
import java.util.Date;
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

import lombok.Data;

@Entity
@Table(name = "templates")
public @Data class Template implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String description;

	private Date date;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nutritionist_id")
	private User nutritionist;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "template_id")
	private List<TemplateRecipe> items;

	
	/*@JoinTable(name = "templates_recipes", joinColumns = @JoinColumn(name = "template_id", nullable = false), inverseJoinColumns = @JoinColumn(name = "recipe_id", nullable = false))
	//@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//private List<Recipe> recipes;*/

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
