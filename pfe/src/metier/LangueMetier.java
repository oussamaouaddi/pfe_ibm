package metier;

import java.util.List;

import model.Langue;
import dao.IdaoLangue;

public class LangueMetier {

	IdaoLangue daoLangue;

	public List<Langue> getallLangues() {
		return daoLangue.getallLangue();

	}

	public Langue getLanguebyid(int id) {

		return daoLangue.getLanguebyid(id);

	}

	public void addLangue(Langue b) {

		daoLangue.addLangue(b);

	}

	public void setdaoLangue(IdaoLangue daoLangue) {
		this.daoLangue = daoLangue;
	}

	public void deleteLangue(int i) {
		daoLangue.deleteLangue(i);
		;
	}

	public void updateLangue(Langue c) {
		daoLangue.updateLangue(c);
	}

}
