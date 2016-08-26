package it.azienda.progetto.dto;

import java.util.Set;
              
public interface UserDTO {

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

	public Set<RatingDTO> getRatings();

	public void setRatings(Set<RatingDTO> ratings);

	public RoleDTO getRole();

	public void setRole(RoleDTO role);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

}
