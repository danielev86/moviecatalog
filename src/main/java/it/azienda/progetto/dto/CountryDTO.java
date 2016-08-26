package it.azienda.progetto.dto;

import java.util.Set;

import it.azienda.progetto.dto.impl.CountryDTOImpl;

public interface CountryDTO {

	public Integer getId();

	public void setId(Integer id);

	public String getCountry();

	public void setCountry(String country);

	public Set<StarDTO> getStars();

	public void setStars(Set<StarDTO> stars);

	public Set<CompanyDTO> getCompanies();

	public void setCompanies(Set<CompanyDTO> companies);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

}
