package it.azienda.progetto.dto;

import java.util.Set;

public interface RoleDTO {

	public Integer getId();

	public void setId(Integer id);

	public String getRole();

	public void setRole(String role);

	public Set<UserDTO> getUsers();

	public void setUsers(Set<UserDTO> users);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

}
