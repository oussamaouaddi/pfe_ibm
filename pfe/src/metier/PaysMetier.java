package metier;

import java.util.List;

import model.Pays;
import dao.IdaoPays;

public class PaysMetier {

	IdaoPays daoPays;

	public List<Pays> getallPayss() {
		return daoPays.getallPays();

	}

	public Pays getPaysbyid(int id) {

		return daoPays.getPaysbyid(id);

	}

	public void addPays(Pays b) {

		daoPays.addPays(b);

	}

	public void setdaoPays(IdaoPays daoPays) {
		this.daoPays = daoPays;
	}

	public void deletePays(int i) {
		daoPays.deletePays(i);
		;
	}

	public void updatePays(Pays c) {
		daoPays.updatePays(c);
	}

}
