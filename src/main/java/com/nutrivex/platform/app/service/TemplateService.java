package com.nutrivex.platform.app.service;

import java.util.List;

import com.nutrivex.platform.app.models.Template;

public interface TemplateService extends CrudService<Template> {
	
	public List<Template> fetchTemplatesByNutritionistId(Long id) throws Exception;

}
