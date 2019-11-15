package com.nutrivex.platform.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


//CLASE EQUIVALENTE A TABLA INTERMEDIA
//EN ESTE CASO NO SIRVE MANY TO MANY PORQUE LA RELACION TIENE OTROS ATRIBUTOS 
@Entity
@Table(name = "nutrition_plan_recipes")
public class NutritionPlanRecipe implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	//DIA PROGRAMADO PARA LA COMIDA
	@Column(name = "food_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date foodDate;
	
	//NUMERO DE ORDEN PARA LA COMIDA EN EL DIA
	@Column(name = "food_number")
	private int foodNumber;
	
	//RECETA DEL PLAN 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "recipe_id")
	private Recipe recipe;
	
	//GETTERS Y SETTERS
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFoodDate() {
		return foodDate;
	}

	public void setFoodDate(Date foodDate) {
		this.foodDate = foodDate;
	}

	public int getFoodNumber() {
		return foodNumber;
	}

	public void setFoodNumber(int foodNumber) {
		this.foodNumber = foodNumber;
	}
	
	private static final long serialVersionUID = 1L;
}
