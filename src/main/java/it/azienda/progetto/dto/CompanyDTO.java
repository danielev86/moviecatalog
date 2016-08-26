package it.azienda.progetto.dto;

import java.util.Set;

import it.azienda.progetto.dto.impl.CompanyDTOImpl;

public interface CompanyDTO {

	public Long getId();

	public void setId(Long id);

	public String getCompanyName();

	public void setCompanyName(String companyName);

	public CountryDTO getCountry();

	public void setCountry(CountryDTO country);

	public Set<MovieDTO> getMovies();

	public void setMovies(Set<MovieDTO> movies);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

}
