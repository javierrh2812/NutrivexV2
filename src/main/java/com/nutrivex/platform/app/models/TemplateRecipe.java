package com.nutrivex.platform.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "template_recipe")
public @Data class TemplateRecipe implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	// NUMERO DE DIA PARA LA COMIDA EN LA SEMANA
	@Column(name = "day_number")
	private int dayNumber;
	
	// NUMERO DE ORDEN PARA LA COMIDA EN EL DIA
	@Column(name = "food_number")
	private int foodNumber;

	// RECETA DEL PLAN
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "recipe_id")
	private Recipe recipe;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
