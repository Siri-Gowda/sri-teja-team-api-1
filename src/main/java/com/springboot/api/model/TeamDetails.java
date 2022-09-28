package com.springboot.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Team")
public class TeamDetails {
	
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String company;
	
	private String location;
	
	private String role;
	//parameterized method
	public TeamDetails() {
		
	}
	
	public TeamDetails(int id,String name,String company,String location,String role) {
		this.id=id;
		this.name=name;
		this.company=company;
		this.location=location;
		this.role=role;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "TeamDetails [id=" + id + ", name=" + name + ", company=" + company + ", location=" + location
				+ ", role=" + role + "]";
	}
	
	

	
	
	
	
	
	
	
	
	
}
