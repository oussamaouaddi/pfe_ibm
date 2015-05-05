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

import metier.TypeImmeubleMetier;
import model.TypeImmeuble;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/Service")
public class TypeImmeubleService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	TypeImmeubleMetier met = (TypeImmeubleMetier) context.getBean("TypeImmeubleMetier");

	@GET
	@Path("/TypeImmeuble")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TypeImmeuble> getallTypeImmeuble() {
		return met.getallTypeImmeubles();
	}

	@GET
	@Path("/TypeImmeuble/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TypeImmeuble getClientbyid(@PathParam(value = "id") int id) {
		return met.getTypeImmeublebyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteTypeImmeuble(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		TypeImmeuble c = met.getTypeImmeublebyid(id);
		//c.setVille(ville);
		 met.updateTypeImmeuble(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/TypeImmeuble")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addTypeImmeuble(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
