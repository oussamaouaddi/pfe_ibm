package metier;

import java.util.List;

import model.CreditImmobilier;
import dao.IdaoCreditImmobilier;

public class CreditImmobilierMetier {

	IdaoCreditImmobilier daoCreditImmobilier;

	public List<CreditImmobilier> getallCreditImmobiliers() {
		return daoCreditImmobilier.getallCreditImmobilier();

	}

	public CreditImmobilier getCreditImmobilierbyid(int id) {

		return daoCreditImmobilier.getCreditImmobilierbyid(id);

	}

	public void addCreditImmobilier(CreditImmobilier b) {

		daoCreditImmobilier.addCreditImmobilier(b);

	}

	public void setdaoCreditImmobilier(IdaoCreditImmobilier daoCreditImmobilier) {
		this.daoCreditImmobilier = daoCreditImmobilier;
	}

	public void deleteCreditImmobilier(int i) {
		daoCreditImmobilier.deleteCreditImmobilier(i);
		;
	}

	public void updateCreditImmobilier(CreditImmobilier c) {
		daoCreditImmobilier.updateCreditImmobilier(c);
	}

}
