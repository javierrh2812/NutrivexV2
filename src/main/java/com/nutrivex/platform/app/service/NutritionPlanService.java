package com.nutrivex.platform.app.service;

import java.util.List;

import com.nutrivex.platform.app.models.NutritionPlan;

public interface NutritionPlanService {
	
	public abstract int createNutritionPlan(NutritionPlan np);
	
	public abstract int updateNutritionPlan(Long id, NutritionPlan np);
	
	public abstract int deleteNutritionPlan(Long id);
	
	public abstract NutritionPlan findNutrionPlanByPatientId(Long id_pat);
	
	public abstract NutritionPlan findNutrionPlanByNutritionistId(Long id_nutr);
	
	public abstract List<NutritionPlan> findNutritionPlansByNutritionistId(Long id_nutr);
	
}
