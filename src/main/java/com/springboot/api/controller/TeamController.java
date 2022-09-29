package com.springboot.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.model.TeamDetails;

import com.springboot.api.serverice.TeamService;



@RestController
@RequestMapping("/api")
public class TeamController {
	
	//using log4j to print the logs in the console
	private static final Logger logger = LoggerFactory.getLogger(TeamController.class);
	
	@Autowired
	private TeamService teamService;
	
	
	//using post method
	@PostMapping("/team-details")
	public String addTeamDetails(@RequestBody TeamDetails teamDetails) {
		logger.info(" Team Details::"+teamDetails);
		String response ="Software Developers";
		return response;
	}
	@GetMapping("/get-team-details/{id}")
	public String getTeamDetails(@PathVariable int id) {
		logger.info("Id ="+id);
		String response = "My id ::"+id;
		return response;
	}
	@GetMapping("/get-team-details/{name}")
	public String getTeamDetails(@RequestParam String name) {
		logger.info("Name::"+name);
		String response = "Inserted name by RequestParam";
		return response;
	}
	@PutMapping("/update-team-details/{location}")
	public String updateTeamDetails(@RequestBody TeamDetails teamDetails  ,@PathVariable String location) {
		logger.info("Location::"+location);
		String response = "Update location using put method::"+location;
		return response;
	}
	@DeleteMapping("/delete-team-details")
	public String deleteTeamDetailsByid(@RequestParam int id) {
		logger.info("Id::"+id);
		String response="Data deleted by id::"+id;
		return response;
	}
	@PatchMapping("/partial-update-team-details")
	public String partialUpdateByid(@PathVariable int id) {
		logger.info("Update team Details::"+id);
		String response= "Successfully updated ";
		return response;
		
	}
	@PostMapping("/add-team-details")
	public String insertTeamDetails(@RequestBody TeamDetails teamDetails) {
		logger.info("Insert::"+teamDetails);
		String response = teamService.insertTeamDetails(teamDetails);
		return response;
		
	
	}
	@GetMapping("/team-data/{id}")
	public TeamDetails getTeamDetailsByid(@PathVariable int id) {
		logger.info("Id in contoller layer::"+id);
		TeamDetails response = teamService.getTeamDetailsByid(id);
		return response;
	}
	/*@DeleteMapping("/delete-team-data/{name}")
	public TeamDetails deleteTeamDetailsByname(@PathVariable String name) {
		logger.info("Name in controller Layer::"+name);
		TeamDetails response = teamService.deleteTeamDetailsByname(name);
		return response;
	}*/
	
		
	}
	
		
	
	
	





