package metier;

import java.util.List;

import model.Existence;
import dao.IdaoExistence;

public class ExistenceMetier {

	IdaoExistence daoExistence;

	public List<Existence> getallExistences() {
		return daoExistence.getallExistence();

	}

	public Existence getExistencebyid(int id) {

		return daoExistence.getExistencebyid(id);

	}

	public void addExistence(Existence b) {

		daoExistence.addExistence(b);

	}

	public void setdaoExistence(IdaoExistence daoExistence) {
		this.daoExistence = daoExistence;
	}

	public void deleteExistence(int i) {
		daoExistence.deleteExistence(i);
		;
	}

	public void updateExistence(Existence c) {
		daoExistence.updateExistence(c);
	}

}
