package it.azienda.progetto.hibernate.bean;

import java.util.Set;

import it.azienda.progetto.hibernate.bean.impl.UserImpl;

public interface User {

	public Integer getId();

	public void setId(Integer id);

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public String getUsername();

	public void setUsername(String username);

	public String getPassword();

	public void setPassword(String password);

	public String getEmail();

	public void setEmail(String email);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

	public Set<Rating> getRatings();

	public void setRatings(Set<Rating> ratings);

	public Role getRole();

	public void setRole(Role role);

}
