package com.nutrivex.platform.app.service;

import java.util.Collection;

import com.nutrivex.platform.app.models.Request;

public interface RequestService {
	public int createRequest(Request request);
	public int deleteRequest(Long id);
	public int updateRequest(Long id, Request request);
	public Request findRequestByPatientId(Long id);
	public Collection<Request> findRequestByNutritionistId(Long id_nut);
	public void acceptingRequest(Long id_pat);
	public void rejectingRequest(Long id_pat);
	public Collection<Request> getRequestsByNutritionistId (Long id);
}
