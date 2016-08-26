package it.azienda.progetto.dto.impl;

import java.io.Serializable;
import java.util.Date;

import it.azienda.progetto.dto.CountryDTO;
import it.azienda.progetto.dto.StarDTO;

public class StarDTOImpl implements StarDTO, Serializable {

	private Integer id;
	private String firstName;
	private String lastName;
	private Date born;
	private String biography;
	private CountryDTO country;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBorn() {
		return born;
	}

	public void setBorn(Date born) {
		this.born = born;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

}
