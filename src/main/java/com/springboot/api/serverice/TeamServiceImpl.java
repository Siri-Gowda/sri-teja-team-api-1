package com.springboot.api.serverice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springboot.api.model.TeamDetails;
import com.springboot.api.repository.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {
	private static final Logger logger = LoggerFactory.getLogger(TeamServiceImpl.class);
	
	@Autowired
	private TeamRepository teamRepositoty;

	
	

	@Override
	public String insertTeamDetails(TeamDetails teamDetails) {
		logger.info("Data in service layer::"+teamDetails);
		teamRepositoty.save(teamDetails);
		return null;
	
	
	}




	@Override
	public TeamDetails getTeamDetailsByid(int id) {
		logger.info("Id in service layer::"+id);
		TeamDetails response=teamRepositoty.findByid(id);
		return response;
	}




	/*@Override
	public TeamDetails deleteTeamDetailsByname(String name) {
		logger.info("Name in Service layer::"+name);
		TeamDetails response = teamRepositoty.findByname(name);
		return response;
	}*/





	}





	
		
		
	






