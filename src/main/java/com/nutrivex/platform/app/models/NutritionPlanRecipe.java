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

@Entity
@Table(name = "nutrition_plan_recipes")
public class NutritionPlanRecipe implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@Column(name = "food_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date foodDate;
	
	@Column(name = "food_number")
	private int foodNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nutrition_plan_id")
	private NutritionPlan nutritionPlan; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "recipe")
	private Recipe recipe;
	
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
	
	
}
