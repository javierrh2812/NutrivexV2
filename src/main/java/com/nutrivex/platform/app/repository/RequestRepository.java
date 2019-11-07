package com.nutrivex.platform.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nutrivex.platform.app.models.Request;

public interface RequestRepository extends JpaRepository<Request, Long>{
	
	@Query("select r from Request r where r.nutritionist.id=?1")
	public Collection<Request> listarSolicitudesPorIdDeNutricionista(Long id);
	
	@Query("select r from Request r where r.patient.id=?1")
	public Request buscarSolicitudDePaciente(Long id_pat);

}
