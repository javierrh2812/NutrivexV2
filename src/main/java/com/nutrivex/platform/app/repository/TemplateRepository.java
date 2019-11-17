package com.nutrivex.platform.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.Template;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long>{
	
	@Query("select t from Template t where t.nutritionist_id=?1")
	public Collection<Template> findTemplatesByNutritionistId(Long id_nutr);
	
	@Query("select t from Template t where t.nutritionist_id=?1")
	public Template findTemplateByNutritionistId(Long id_nutr);

}
