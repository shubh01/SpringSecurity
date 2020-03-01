package com.springsecurity.fitnesstracker.rest.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Path("Goal")
@Service("GoalRestImpl")
@Consumes("application/json")
@Produces("application/json")
public class GoalRestImpl {

	@GET
	@Path("getGoal")
	public void getGoal() {
		System.out.println("Here I am in get goal method");
	}
	
}
