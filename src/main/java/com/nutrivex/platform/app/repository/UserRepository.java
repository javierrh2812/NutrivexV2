package com.nutrivex.platform.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	 public User findByUsername(String username);
<<<<<<< HEAD
	 
	 	@Modifying
		@Query("update User r set r.role.id = 1 where r.id= :id")
		public void updateDataPat(@Param("id") Long id_pat);
		
		@Modifying
		@Query("update User r set r.role.id = 1 where r.person.id= :id")
		public void updateDataNutri(@Param("id") Long id_pat);
		
		@Query("select max(u.id) from User u")
		public Long getLastId();
		
=======
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708
}
