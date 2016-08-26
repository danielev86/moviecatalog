package it.azienda.progetto.hibernate.bean;

import java.util.Set;


public interface Company {

	public Long getId();

	public void setId(Long id);

	public String getCompanyName();

	public void setCompanyName(String companyName);

	public Country getCountry();

	public void setCountry(Country country);

	public Set<Movie> getMovies();

	public void setMovies(Set<Movie> movies);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);
}
