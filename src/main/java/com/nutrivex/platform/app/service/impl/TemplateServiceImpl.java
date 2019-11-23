package com.nutrivex.platform.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.Template;
import com.nutrivex.platform.app.repository.TemplateRepository;
import com.nutrivex.platform.app.service.TemplateService;

@Service
public class TemplateServiceImpl implements TemplateService{
	
	@Autowired
	private TemplateRepository templateRepository;

	@Override
	public List<Template> findAll() throws Exception {
		return templateRepository.findAll();
	}

	@Override
	public void save(Template t) throws Exception {
		templateRepository.save(t);
	}

	@Override
	public Optional<Template> findById(Long id) throws Exception {
		return templateRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) throws Exception {
		templateRepository.deleteById(id);
	}

	@Override
	public List<Template> fetchTemplatesByNutritionistId(Long id) throws Exception {
		return templateRepository.fetchTemplatesByNutritionistId(id);
	}

}
