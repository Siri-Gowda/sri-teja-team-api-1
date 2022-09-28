package com.springboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.api.model.TeamDetails;

@Repository
public interface TeamRepository extends JpaRepository<TeamDetails, String> {


		
	}
	

	

	


	
