package com.nutrivex.platform.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.NutritionPlan;

@Repository
public interface NutritionPlanRepository extends JpaRepository<NutritionPlan, Long> {
	
	@Query("select np from NutritionPlan np Where np.nutritionist_id=?1")
	public Collection<NutritionPlan> findNutritionPlansByNutritionistId(Long id_nutr);
	
	@Query("select np from NutritionPlan np where np.patient_id=?1")
	public NutritionPlan findNutritionPlanByPatientId(Long id_pat);
	
	@Query("select np from NutritionPlan np where np.nutritionist_id=?1")
	public NutritionPlan findNutritionPlanByNutritionistId(Long id_nutr);
}
