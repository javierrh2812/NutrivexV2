package com.nutrivex.platform.app.service;

import com.nutrivex.platform.app.models.NutritionPlan;

public interface NutritionPlanService {
	public abstract int createNutritionPlan(NutritionPlan np);
	public abstract int updateNutritionPlan(Long id, NutritionPlan np);
	public abstract int deleteNutritionPlan(Long id);
}
