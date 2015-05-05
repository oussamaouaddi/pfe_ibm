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

import metier.LangueMetier;
import model.Langue;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/Service")
public class LangueService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	LangueMetier met = (LangueMetier) context.getBean("Languemetier");

	@GET
	@Path("/Langue")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Langue> getallLangue() {
		return met.getallLangues();
	}

	@GET
	@Path("/Langue/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Langue getClientbyid(@PathParam(value = "id") int id) {
		return met.getLanguebyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteLangue(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		Langue c = met.getLanguebyid(id);
		//c.setVille(ville);
		 met.updateLangue(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/Langue")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addLangue(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
