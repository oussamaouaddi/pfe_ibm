import metier.ClientsMetier;
import model.Clients;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		ClientsMetier met = (ClientsMetier) context.getBean("ClientsMetier");
	
		Clients b = met.getClientsbyid(1);
		b.setNom("ousskira");
		met.updateClients(b);
		//met.deleteClient(14);
		System.out.println(b.getPrenom());
		}
}
