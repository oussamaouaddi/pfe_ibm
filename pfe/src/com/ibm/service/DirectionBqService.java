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

import metier.DirectionBqMetier;
import model.DirectionBq;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/Service")
public class DirectionBqService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	DirectionBqMetier met = (DirectionBqMetier) context.getBean("DirectionBqMetier");

	@GET
	@Path("/DirectionBq")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DirectionBq> getallDirectionBq() {
		return met.getallDirectionBqs();
	}

	@GET
	@Path("/DirectionBq/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public DirectionBq getClientbyid(@PathParam(value = "id") int id) {
		return met.getDirectionBqbyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteDirectionBq(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		DirectionBq c = met.getDirectionBqbyid(id);
		//c.setVille(ville);
		 met.updateDirectionBq(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/DirectionBq")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addDirectionBq(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
