package dao;

import java.util.List;

import model.Langue;



public interface IdaoLangue {
	
	public List<Langue> getallLangue();
	public Langue getLanguebyid(int id);
	public void addLangue(Langue c);
	public void updateLangue(Langue c );
	public void deleteLangue(int i);

}
