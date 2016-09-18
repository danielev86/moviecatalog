package it.azienda.progetto.dto;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import it.azienda.progetto.dto.stub.StubDTO;

@ManagedBean(name="countryBean")
@ViewScoped
public class CountryBean implements Serializable {
	
	public static List<CountryDTO> retrieve(){
		return StubDTO.countriesStub();
	}
	
	

}
