package it.azienda.progetto.hibernate.bean;

import java.util.Set;

public interface Country {

	public Integer getId();

	public void setId(Integer id);

	public String getCountry();

	public void setCountry(String country);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

	public Set<Star> getStars();

	public void setStars(Set<Star> stars);

	public Set<Company> getCompanies();

	public void setCompanies(Set<Company> companies);

}
