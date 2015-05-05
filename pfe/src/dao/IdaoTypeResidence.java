package dao;

import java.util.List;

import model.TypeResidence;



public interface IdaoTypeResidence {
	
	public List<TypeResidence> getallTypeResidence();
	public TypeResidence getTypeResidencebyid(int id);
	public void addTypeResidence(TypeResidence c);
	public void updateTypeResidence(TypeResidence c );
	public void deleteTypeResidence(int i);

}
