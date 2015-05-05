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

import metier.RoleMetier;
import model.Role;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/Service")
public class RoleService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	RoleMetier met = (RoleMetier) context.getBean("RoleMetier");

	@GET
	@Path("/Role")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Role> getallRole() {
		return met.getallRoles();
	}

	@GET
	@Path("/Role/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Role getClientbyid(@PathParam(value = "id") int id) {
		return met.getRolebyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteRole(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		Role c = met.getRolebyid(id);
		//c.setVille(ville);
		 met.updateRole(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/Role")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addRole(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
