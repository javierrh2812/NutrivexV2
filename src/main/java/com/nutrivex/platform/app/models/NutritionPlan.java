package com.nutrivex.platform.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nutrition_plans")
public class NutritionPlan implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "target_weight")
	private double targetWeight;
	
	@Column(name = "total_time")
	private int totalTime;
	
	@Column(name = "food_quantity_per_day")
	private int foodQuantityPerDay;
	
	@OneToMany(mappedBy = "nutritionPlan", cascade = CascadeType.ALL)
	private List<NutritionPlanRecipe> nutritionPlanRecipe;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTargetWeight() {
		return targetWeight;
	}

	public void setTargetWeight(double targetWeight) {
		this.targetWeight = targetWeight;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public int getFoodQuantityPerDay() {
		return foodQuantityPerDay;
	}

	public void setFoodQuantityPerDay(int foodQuantityPerDay) {
		this.foodQuantityPerDay = foodQuantityPerDay;
	}


}
