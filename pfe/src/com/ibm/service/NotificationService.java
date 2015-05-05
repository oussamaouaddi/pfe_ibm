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

import metier.NotificationMetier;
import model.Notification;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/Service")
public class NotificationService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	NotificationMetier met = (NotificationMetier) context.getBean("Notificationmetier");

	@GET
	@Path("/Notification")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Notification> getallNotification() {
		return met.getallNotifications();
	}

	@GET
	@Path("/Notification/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Notification getClientbyid(@PathParam(value = "id") int id) {
		return met.getNotificationbyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteNotification(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		Notification c = met.getNotificationbyid(id);
		//c.setVille(ville);
		 met.updateNotification(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/Notification")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addNotification(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
