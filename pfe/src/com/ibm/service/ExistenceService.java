package com.ibm.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import metier.AgentMetier;
import model.Agent;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/Service")
public class ExistenceService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	AgentMetier met = (AgentMetier) context.getBean("Agentmetier");

	@GET
	@Path("/Agent")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Agent> getallAgent() {
		return met.getallAgents();
	}

	@GET
	@Path("/Agent/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Agent getClientbyid(@PathParam(value = "id") int id) {
		return met.getAgentbyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteAgent(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		Agent c = met.getAgentbyid(id);
		//c.setVille(ville);
		 met.updateAgent(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/Agent")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addAgent(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
