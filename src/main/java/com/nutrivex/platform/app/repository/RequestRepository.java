package com.nutrivex.platform.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long>{
	
	@Query("select r from Request r where r.nutritionist.id=?1 and r.acepted is null")
	public Collection<Request> listarSolicitudesPorIdDeNutricionista(Long id_nut);
	
	@Query("select r from Request r where r.patient.id=?1")
	public Request buscarSolicitudDePaciente(Long id_pat);
	
	@Query("select r from Request r where r.nutritionist.id=?1")
	public Collection<Request> findRequestByNutritionist(Long id_nut);
	
	@Modifying
	@Query("update Request r set r.acepted = 0 where r.patient.id= :id")
	public void rejectRequest(@Param("id") Long id_pat);
	
	@Modifying
	@Query("update Request r set r.acepted = 1 where r.patient.id= :id")
	public void acceptRequest(@Param("id") Long id_pat);

}
