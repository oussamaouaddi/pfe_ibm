package dao;

import java.util.List;

import model.TypeImmeuble;



public interface IdaoTypeImmeuble {
	
	public List<TypeImmeuble> getallTypeImmeuble();
	public TypeImmeuble getTypeImmeublebyid(int id);
	public void addTypeImmeuble(TypeImmeuble c);
	public void updateTypeImmeuble(TypeImmeuble c );
	public void deleteTypeImmeuble(int i);

}
