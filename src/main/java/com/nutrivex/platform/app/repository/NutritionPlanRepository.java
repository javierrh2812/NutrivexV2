package com.nutrivex.platform.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nutrivex.platform.app.models.NutritionPlan;

public interface NutritionPlanRepository extends JpaRepository<NutritionPlan, Long> {
	
	@Query("select np from NutritionPlan np Where np.patient.id=1")
	public Collection<NutritionPlan> listarPlanesNutricionales();
	

	@Query("select np from NutritionPlan np where np.patient.id=?1")
	public NutritionPlan buscarPlanNutricionalDePaciente(Long id_pat);
}
