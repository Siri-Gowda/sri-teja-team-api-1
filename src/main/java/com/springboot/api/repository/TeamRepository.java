package com.springboot.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.api.model.TeamDetails;

@Repository
public interface TeamRepository extends JpaRepository<TeamDetails, String> {
	
	
   @Query(value="select * from team c where c.id = ?1",nativeQuery = true)
    
	TeamDetails findByid(int id);
   
   @Query(value="select * from team c where c.id=:id and c.name=:name",nativeQuery=true)
   TeamDetails findByIdAndName(@Param("id")int id,@Param("name") String name);




   
   

	


		
	}
	

	

	


	
