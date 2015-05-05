package metier;

import java.util.List;

import model.TypeResidence;
import dao.IdaoTypeResidence;

public class TypeResidenceMetier {

	IdaoTypeResidence daoTypeResidence;

	public List<TypeResidence> getallTypeResidences() {
		return daoTypeResidence.getallTypeResidence();

	}

	public TypeResidence getTypeResidencebyid(int id) {

		return daoTypeResidence.getTypeResidencebyid(id);

	}

	public void addTypeResidence(TypeResidence b) {

		daoTypeResidence.addTypeResidence(b);

	}

	public void setdaoTypeResidence(IdaoTypeResidence daoTypeResidence) {
		this.daoTypeResidence = daoTypeResidence;
	}

	public void deleteTypeResidence(int i) {
		daoTypeResidence.deleteTypeResidence(i);
		;
	}

	public void updateTypeResidence(TypeResidence c) {
		daoTypeResidence.updateTypeResidence(c);
	}

}
