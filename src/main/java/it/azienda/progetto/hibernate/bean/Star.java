package it.azienda.progetto.hibernate.bean;

import java.util.Date;

public interface Star {

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

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

	public Country getCountry();

	public void setCountry(Country country);
}
