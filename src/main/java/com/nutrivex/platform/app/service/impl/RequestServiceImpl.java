package com.nutrivex.platform.app.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.Request;
import com.nutrivex.platform.app.repository.RequestRepository;
import com.nutrivex.platform.app.service.RequestService;

@Service
public class RequestServiceImpl implements RequestService{

	@Autowired
	RequestRepository requestRepository;
	
	@Override
	public int createRequest(Request request) {
		// TODO Auto-generated method stub
		requestRepository.save(request);
		return 0;
	}

	@Override
	public int deleteRequest(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateRequest(Long id, Request request) {
		int result = 0;
		Optional<Request> originalRequest = requestRepository.findById(id);
		if(originalRequest.isPresent()) {
			requestRepository.save(request);
		}
		return result;
	}
	
	@Override
	public void acceptingRequest(Long id_pat) {
		requestRepository.acceptRequest(id_pat);
	}
	
	@Override
	public void rejectingRequest(Long id_pat) {
		requestRepository.rejectRequest(id_pat);
	}

	@Override
	public Request findRequestById(Long id) {
		return requestRepository.findById(id).orElse(null);
	}

	@Override
	public Request findRequestByPatientId(Long id_pat) {
		return requestRepository.findRequestByPatientId(id_pat);
	}

	@Override
	public Collection<Request> findRequestsByNutritionistId(Long id_nut) {
		return requestRepository.findAllRequestsByNutritionistId(id_nut);
	}

}
