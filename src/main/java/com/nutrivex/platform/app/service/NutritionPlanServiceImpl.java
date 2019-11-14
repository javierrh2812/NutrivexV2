package com.nutrivex.platform.app.service;

import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.NutritionPlan;
import com.nutrivex.platform.app.repository.NutritionPlanRepository;

@Service
public class NutritionPlanServiceImpl implements NutritionPlanService {

	private NutritionPlanRepository npr;
	
	@Override
	public int createNutritionPlan(NutritionPlan np) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateNutritionPlan(Long id, NutritionPlan np) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteNutritionPlan(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public NutritionPlan findNutrionPlanByPatientId() {
		return npr.buscarPlanNutricionalDePaciente();
	}
}
