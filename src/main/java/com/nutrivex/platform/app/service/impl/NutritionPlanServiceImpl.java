package com.nutrivex.platform.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.NutritionPlan;
import com.nutrivex.platform.app.repository.NutritionPlanRepository;
import com.nutrivex.platform.app.service.NutritionPlanService;

@Service
public class NutritionPlanServiceImpl implements NutritionPlanService {

	private NutritionPlanRepository nutritionalPlanRepository;

	@Override
	public int createNutritionPlan(NutritionPlan nutritionPlan) {
		nutritionalPlanRepository.save(nutritionPlan);
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
	public NutritionPlan findNutrionPlanByPatientId(Long id_pat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NutritionPlan findNutrionPlanByNutritionistId(Long id_nutr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NutritionPlan> findNutritionPlansByNutritionistId(Long id_nutr) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
