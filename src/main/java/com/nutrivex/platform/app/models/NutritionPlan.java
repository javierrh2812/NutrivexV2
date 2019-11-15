package com.nutrivex.platform.app.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nutrition_plans")
public class NutritionPlan implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//PESO OBJETIVO DEL PACIENTE EN EL PLAN
	@Column(name = "target_weight")
	private double targetWeight;
	
	//TIEMPO EN SEMANAS QUE DURARÁ EL PLAN NUTRICIONAL
	@Column(name = "total_time")
	private int totalTime;
	
	//CANTIDAD DE COMIDAS POR DIA PARA EL PACIENTE
	@Column(name = "food_quantity_per_day")
	private int foodQuantityPerDay;
	
	//NUTRICIONISTA: CREADOR DEL PLAN
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="nutritionist_id")
	private User nutritionist;
	
	//PACIENTE: USA EL PLAN
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "patient_id")
	private User patient;
	
	//RECETAS DEL PLAN NUTRICIONAL
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="nutrition_plan_id")
	private List<NutritionPlanRecipe> items;
	
	
	//CONSTRUCTOR
	public NutritionPlan() {
		this.items = new ArrayList<NutritionPlanRecipe>();
	}

	//GETTERS Y SETTERS 
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

	public User getNutritionist() {
		return nutritionist;
	}

	public void setNutritionist(User nutritionist) {
		this.nutritionist = nutritionist;
	}

	public User getPatient() {
		return patient;
	}

	public void setPatient(User patient) {
		this.patient = patient;
	}

	public List<NutritionPlanRecipe> getItems() {
		return items;
	}

	public void setItems(List<NutritionPlanRecipe> items) {
		this.items = items;
	}
	
	
	private static final long serialVersionUID = 1L;

}
