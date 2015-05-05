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

import metier.TypeResidenceMetier;
import model.TypeResidence;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/Service")
public class TypeResidenceService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	TypeResidenceMetier met = (TypeResidenceMetier) context.getBean("TypeResidenceMetier");

	@GET
	@Path("/TypeResidence")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TypeResidence> getallTypeResidence() {
		return met.getallTypeResidences();
	}

	@GET
	@Path("/TypeResidence/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TypeResidence getClientbyid(@PathParam(value = "id") int id) {
		return met.getTypeResidencebyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteTypeResidence(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		TypeResidence c = met.getTypeResidencebyid(id);
		//c.setVille(ville);
		 met.updateTypeResidence(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/TypeResidence")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addTypeResidence(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
