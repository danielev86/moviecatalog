package it.azienda.progetto.crud.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import it.azienda.progetto.dto.CountryBean;
import it.azienda.progetto.dto.CountryDTO;
import it.azienda.progetto.dto.StarDTO;
import it.azienda.progetto.dto.impl.CountryDTOImpl;
import it.azienda.progetto.dto.impl.StarDTOImpl;
import it.azienda.progetto.hibernate.service.CountryService;
import it.azienda.progetto.hibernate.service.StarService;

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
	@ManagedProperty(value = "#{starService}")
	private StarService starService;
	private boolean confirmInsert;

	@PostConstruct
	public void init() {

		countries = countryService.retrieveAllCountry();
		star = new StarDTOImpl();

	}

	public boolean isConfirmInsert() {
		return confirmInsert;
	}

	public void setConfirmInsert(boolean confirmInsert) {
		this.confirmInsert = confirmInsert;
	}

	public StarService getStarService() {
		return starService;
	}

	public void setStarService(StarService starService) {
		this.starService = starService;
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
	
	

	public String insertStar() {
		CountryDTO country = countryService.retrieveCountryByName(countryVal);
		star.setCountry(country);
		confirmInsert = starService.addStar(star);
		star = new StarDTOImpl();
		countries = countryService.retrieveAllCountry();
		RequestContext.getCurrentInstance().execute("PF('pnlConfirm').show()");
		return null;
	}
	
	public String closeConfirmDialog(){
		RequestContext.getCurrentInstance().execute("PF('pnlConfirm').hide()");
		confirmInsert = false;
		return null;
	}

}
