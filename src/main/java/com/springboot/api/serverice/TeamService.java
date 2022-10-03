package com.springboot.api.serverice;


import com.springboot.api.model.TeamDetails;

public interface TeamService{
	

	public String insertTeamDetails(TeamDetails teamDetails);

	public TeamDetails getTeamDetailsByid(int id);

	public TeamDetails getTeamDataBasedOnIdAndName(int id, String name);//method creation

	

	
	}

	

	

	
