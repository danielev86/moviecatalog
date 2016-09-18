package it.azienda.progetto.crud.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import it.azienda.progetto.dto.CountryBean;
import it.azienda.progetto.dto.CountryDTO;
import it.azienda.progetto.dto.StarDTO;
import it.azienda.progetto.dto.impl.CountryDTOImpl;
import it.azienda.progetto.dto.impl.StarDTOImpl;
import it.azienda.progetto.hibernate.service.CountryService;

@ManagedBean(name = "starBean")
@ViewScoped
public class PersonStarBean implements Serializable {

	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{countryBean}")
	private CountryBean cBean;
	private List<CountryDTO> countries;
	private StarDTO star;
	private String countryVal;
	@ManagedProperty(value = "#{countryService}")
	private CountryService countryService;

	@PostConstruct
	public void init() {
		
		countries = cBean.retrieve();
		star = new StarDTOImpl();

	}

	public CountryBean getcBean() {
		return cBean;
	}

	public void setcBean(CountryBean cBean) {
		this.cBean = cBean;
	}

	public List<CountryDTO> getCountries() {
		return countries;
	}

	public void setCountries(List<CountryDTO> countries) {
		this.countries = countries;
	}

	public StarDTO getStar() {
		return star;
	}

	public void setStar(StarDTO star) {
		this.star = star;
	}

	public CountryService getCountryService() {
		return countryService;
	}

	public void setCountryService(CountryService countryService) {
		this.countryService = countryService;
	}

	public String getCountryVal() {
		return countryVal;
	}

	public void setCountryVal(String countryVal) {
		this.countryVal = countryVal;
	}
	
	public String insertStar(){
		return null;
	}

}
