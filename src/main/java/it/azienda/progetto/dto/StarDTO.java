package it.azienda.progetto.dto;

import java.util.Date;

public interface StarDTO {
	public Integer getId();

	public void setId(Integer id);

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public Date getBorn();

	public void setBorn(Date born);

	public String getBiography();

	public void setBiography(String biography);

	public CountryDTO getCountry();

	public void setCountry(CountryDTO country);

}
