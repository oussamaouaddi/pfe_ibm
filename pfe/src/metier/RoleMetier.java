package metier;

import java.util.List;

import model.Role;
import dao.IdaoRole;

public class RoleMetier {

	IdaoRole daoRole;

	public List<Role> getallRoles() {
		return daoRole.getallRole();

	}

	public Role getRolebyid(int id) {

		return daoRole.getRolebyid(id);

	}

	public void addRole(Role b) {

		daoRole.addRole(b);

	}

	public void setdaoRole(IdaoRole daoRole) {
		this.daoRole = daoRole;
	}

	public void deleteRole(int i) {
		daoRole.deleteRole(i);
		;
	}

	public void updateRole(Role c) {
		daoRole.updateRole(c);
	}

}
