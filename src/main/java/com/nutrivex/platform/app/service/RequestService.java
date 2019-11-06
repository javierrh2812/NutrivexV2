package com.nutrivex.platform.app.service;

import java.util.Collection;

import com.nutrivex.platform.app.models.Request;

public interface RequestService {
	public abstract int createRequest(Request request);
	public abstract int deleteRequest(Long id);
	public abstract int updateRequest(Long id, Request request);
	public abstract Request findRequestByPatientId(Long id);
	public abstract Collection<Request> getRequestsByNutritionistId (Long id);
}
