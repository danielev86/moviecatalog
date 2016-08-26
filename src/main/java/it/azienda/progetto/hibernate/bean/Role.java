package it.azienda.progetto.hibernate.bean;

import java.util.Set;

public interface Role {

	public Integer getId();

	public void setId(Integer id);

	public String getRole();

	public void setRole(String role);
	
	public Set<User> getUsers();

	public void setUsers(Set<User> users);
}
