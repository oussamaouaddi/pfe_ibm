package metier;

import java.util.List;

import model.Expert;
import dao.IdaoExpert;

public class ExpertMetier {

	IdaoExpert daoExpert;

	public List<Expert> getallExperts() {
		return daoExpert.getallExpert();

	}

	public Expert getExpertbyid(int id) {

		return daoExpert.getExpertbyid(id);

	}

	public void addExpert(Expert b) {

		daoExpert.addExpert(b);

	}

	public void setdaoExpert(IdaoExpert daoExpert) {
		this.daoExpert = daoExpert;
	}

	public void deleteExpert(int i) {
		daoExpert.deleteExpert(i);
		;
	}

	public void updateExpert(Expert c) {
		daoExpert.updateExpert(c);
	}

}
