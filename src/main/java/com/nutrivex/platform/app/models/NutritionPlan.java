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

import lombok.Data;

@Entity
@Table(name = "nutrition_plans")
public @Data class NutritionPlan implements Serializable {

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
	
	
	private static final long serialVersionUID = 1L;

}
