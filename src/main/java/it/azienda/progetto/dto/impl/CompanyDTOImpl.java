package it.azienda.progetto.dto.impl;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import it.azienda.progetto.dto.CompanyDTO;
import it.azienda.progetto.dto.CountryDTO;
import it.azienda.progetto.dto.MovieDTO;

public class CompanyDTOImpl implements CompanyDTO, Serializable{
	private Long id;
	private String companyName;
	private CountryDTO country;
	private Set<MovieDTO> movies;
	
	public CompanyDTOImpl(){
		movies = new HashSet<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public Set<MovieDTO> getMovies() {
		return movies;
	}

	public void setMovies(Set<MovieDTO> movies) {
		this.movies = movies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((movies == null) ? 0 : movies.hashCode());
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
		CompanyDTOImpl other = (CompanyDTOImpl) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
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
		if (movies == null) {
			if (other.movies != null)
				return false;
		} else if (!movies.equals(other.movies))
			return false;
		return true;
	}
	
	

}
