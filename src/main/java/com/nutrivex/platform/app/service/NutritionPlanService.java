package com.nutrivex.platform.app.service;

import com.nutrivex.platform.app.models.NutritionPlan;

public interface NutritionPlanService {
	public int createNutritionPlan(NutritionPlan np);
	public int updateNutritionPlan(Long id, NutritionPlan np);
	public int deleteNutritionPlan(Long id);
	public NutritionPlan findNutrionPlanByPatientId();
}
