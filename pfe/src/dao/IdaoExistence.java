package dao;

import java.util.List;

import model.Existence;



public interface IdaoExistence {
	
	public List<Existence> getallExistence();
	public Existence getExistencebyid(int id);
	public void addExistence(Existence c);
	public void updateExistence(Existence c );
	public void deleteExistence(int i);

}
