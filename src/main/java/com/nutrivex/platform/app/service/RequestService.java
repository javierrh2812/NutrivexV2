package com.nutrivex.platform.app.service;

import java.util.Collection;

import com.nutrivex.platform.app.models.Request;

public interface RequestService {
	public abstract int createRequest(Request request);
	public abstract int deleteRequest(Long id);
	public abstract int updateRequest(Long id, Request request);
	public abstract Request findRequestById(Long id);
	public abstract Request findRequestByPatientId(Long id_pat);
	public abstract Collection<Request> findRequestsByNutritionistId(Long id_nut);
	public abstract void acceptingRequest(Long id_pat);
	public abstract void rejectingRequest(Long id_pat);
}
