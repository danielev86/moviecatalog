package it.azienda.progetto.dto.impl;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import it.azienda.progetto.dto.CompanyDTO;
import it.azienda.progetto.dto.CountryDTO;
import it.azienda.progetto.dto.StarDTO;

public class CountryDTOImpl implements CountryDTO, Serializable{
	
	private Integer id;
	private String country;
	private Set<StarDTO> stars;
	private Set<CompanyDTO> companies;
	
	public CountryDTOImpl (){
		stars = new HashSet<>();
		companies = new HashSet<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<StarDTO> getStars() {
		return stars;
	}

	public void setStars(Set<StarDTO> stars) {
		this.stars = stars;
	}

	public Set<CompanyDTO> getCompanies() {
		return companies;
	}

	public void setCompanies(Set<CompanyDTO> companies) {
		this.companies = companies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companies == null) ? 0 : companies.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((stars == null) ? 0 : stars.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDTOImpl other = (CountryDTOImpl) obj;
		if (companies == null) {
			if (other.companies != null)
				return false;
		} else if (!companies.equals(other.companies))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (stars == null) {
			if (other.stars != null)
				return false;
		} else if (!stars.equals(other.stars))
			return false;
		return true;
	}
	
	
	

}
