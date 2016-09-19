package it.azienda.progetto.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.dto.CountryDTO;
import it.azienda.progetto.dto.impl.CountryDTOImpl;
import it.azienda.progetto.hibernate.bean.Country;
import it.azienda.progetto.hibernate.dao.CountryDAO;

@Service
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
public class CountryService {
	
	@Autowired
	@Qualifier("countryDAO")
	private CountryDAO countryDAO;
	
	public CountryDTO retrieveCountryByName(String country){
		CountryDTO countryDTO = new CountryDTOImpl();
		Country nation = countryDAO.retrieveCountryByName(country);
		countryDTO.setId(nation.getId());
		countryDTO.setCountry(nation.getCountry());
		return countryDTO;
	}
	
	public List<CountryDTO> retrieveAllCountry(){
		List<CountryDTO> countries = new ArrayList<>();
		for (Country country : countryDAO.retrieveAllCountry()){
			CountryDTO countryTmp = new CountryDTOImpl();
			countryTmp.setId(country.getId());
			countryTmp.setCountry(country.getCountry());
			countries.add(countryTmp);
		}
		return countries;
	}
}
