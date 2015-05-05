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

import metier.CreditImmobilierMetier;
import model.CreditImmobilier;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/Service")
public class CreditImmobilierService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	CreditImmobilierMetier met = (CreditImmobilierMetier) context.getBean("CreditImmobilierMetier");

	@GET
	@Path("/CreditImmobilier")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CreditImmobilier> getallCreditImmobilier() {
		return met.getallCreditImmobiliers();
	}

	@GET
	@Path("/CreditImmobilier/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public CreditImmobilier getClientbyid(@PathParam(value = "id") int id) {
		return met.getCreditImmobilierbyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteCreditImmobilier(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		CreditImmobilier c = met.getCreditImmobilierbyid(id);
		//c.setVille(ville);
		 met.updateCreditImmobilier(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/CreditImmobilier")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addCreditImmobilier(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
