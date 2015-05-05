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

import metier.ExpertMetier;
import model.Expert;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/Service")
public class ExpertService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	ExpertMetier met = (ExpertMetier) context.getBean("Expertmetier");

	@GET
	@Path("/Expert")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Expert> getallExpert() {
		return met.getallExperts();
	}

	@GET
	@Path("/Expert/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Expert getClientbyid(@PathParam(value = "id") int id) {
		return met.getExpertbyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteExpert(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		Expert c = met.getExpertbyid(id);
		//c.setVille(ville);
		 met.updateExpert(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/Expert")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addExpert(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
