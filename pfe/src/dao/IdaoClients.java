package dao;

import java.util.List;

import model.Clients;



public interface IdaoClients {
	
	public List<Clients> getallClients();
	public Clients getClientsbyid(int id);
	public void addClients(Clients c);
	public void updateClients(Clients c );
	public void deleteClients(int i);

}
