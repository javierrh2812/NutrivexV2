package com.nutrivex.platform.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.Template;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long>{

	@Query("SELECT t FROM Template t WHERE t.nutritionist.id=?1")
	public List<Template> fetchTemplatesByNutritionistId(Long id);
}
