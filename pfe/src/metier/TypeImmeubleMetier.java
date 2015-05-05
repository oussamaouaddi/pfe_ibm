package metier;

import java.util.List;

import model.TypeImmeuble;
import dao.IdaoTypeImmeuble;

public class TypeImmeubleMetier {

	IdaoTypeImmeuble daoTypeImmeuble;

	public List<TypeImmeuble> getallTypeImmeubles() {
		return daoTypeImmeuble.getallTypeImmeuble();

	}

	public TypeImmeuble getTypeImmeublebyid(int id) {

		return daoTypeImmeuble.getTypeImmeublebyid(id);

	}

	public void addTypeImmeuble(TypeImmeuble b) {

		daoTypeImmeuble.addTypeImmeuble(b);

	}

	public void setdaoTypeImmeuble(IdaoTypeImmeuble daoTypeImmeuble) {
		this.daoTypeImmeuble = daoTypeImmeuble;
	}

	public void deleteTypeImmeuble(int i) {
		daoTypeImmeuble.deleteTypeImmeuble(i);
		;
	}

	public void updateTypeImmeuble(TypeImmeuble c) {
		daoTypeImmeuble.updateTypeImmeuble(c);
	}

}
