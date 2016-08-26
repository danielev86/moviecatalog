package it.azienda.progetto.hibernate.bean.impl;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import it.azienda.progetto.hibernate.bean.Company;
import it.azienda.progetto.hibernate.bean.Country;
import it.azienda.progetto.hibernate.bean.Star;

public class CountryImpl implements Country, Serializable {

	private Integer id;
	private String country;
	private Set<Star> stars;
	private Set<Company> companies;

	public CountryImpl(){
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CountryImpl other = (CountryImpl) obj;
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
		return true;
	}
	public Set<Star> getStars() {
		return stars;
	}
	public void setStars(Set<Star> stars) {
		this.stars = stars;
	}
	public Set<Company> getCompanies() {
		return companies;
	}
	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}
	
	

}
