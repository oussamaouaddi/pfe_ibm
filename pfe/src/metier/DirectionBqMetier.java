package metier;

import java.util.List;

import model.DirectionBq;
import dao.IdaoDirectionBq;

public class DirectionBqMetier {

	IdaoDirectionBq daoDirectionBq;

	public List<DirectionBq> getallDirectionBqs() {
		return daoDirectionBq.getallDirectionBq();

	}

	public DirectionBq getDirectionBqbyid(int id) {

		return daoDirectionBq.getDirectionBqbyid(id);

	}

	public void addDirectionBq(DirectionBq b) {

		daoDirectionBq.addDirectionBq(b);

	}

	public void setdaoDirectionBq(IdaoDirectionBq daoDirectionBq) {
		this.daoDirectionBq = daoDirectionBq;
	}

	public void deleteDirectionBq(int i) {
		daoDirectionBq.deleteDirectionBq(i);
		;
	}

	public void updateDirectionBq(DirectionBq c) {
		daoDirectionBq.updateDirectionBq(c);
	}

}
