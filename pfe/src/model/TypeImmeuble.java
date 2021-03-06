package model;

// Generated 28 avr. 2015 00:46:40 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TypeImmeuble generated by hbm2java
 */
@Entity
@Table(name = "type_immeuble", catalog = "ibm_pfe")
public class TypeImmeuble implements java.io.Serializable {

	private int idType;
	private String designation;
	private Set<CreditImmobilier> creditImmobiliers = new HashSet<CreditImmobilier>(
			0);

	public TypeImmeuble() {
	}

	public TypeImmeuble(int idType) {
		this.idType = idType;
	}

	public TypeImmeuble(int idType, String designation,
			Set<CreditImmobilier> creditImmobiliers) {
		this.idType = idType;
		this.designation = designation;
		this.creditImmobiliers = creditImmobiliers;
	}

	@Id
	@Column(name = "id_type", unique = true, nullable = false)
	public int getIdType() {
		return this.idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	@Column(name = "designation", length = 254)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typeImmeuble")
	public Set<CreditImmobilier> getCreditImmobiliers() {
		return this.creditImmobiliers;
	}

	public void setCreditImmobiliers(Set<CreditImmobilier> creditImmobiliers) {
		this.creditImmobiliers = creditImmobiliers;
	}

}
