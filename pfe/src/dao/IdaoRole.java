package dao;

import java.util.List;

import model.Role;



public interface IdaoRole {
	
	public List<Role> getallRole();
	public Role getRolebyid(int id);
	public void addRole(Role c);
	public void updateRole(Role c );
	public void deleteRole(int i);

}
