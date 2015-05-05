package dao;

import java.util.List;

import model.Pays;



public interface IdaoPays {
	
	public List<Pays> getallPays();
	public Pays getPaysbyid(int id);
	public void addPays(Pays c);
	public void updatePays(Pays c );
	public void deletePays(int i);

}
