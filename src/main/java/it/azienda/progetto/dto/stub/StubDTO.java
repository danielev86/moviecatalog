package it.azienda.progetto.dto.stub;

import java.util.ArrayList;
import java.util.List;

import it.azienda.progetto.dto.CountryDTO;
import it.azienda.progetto.dto.impl.CountryDTOImpl;

public class StubDTO {
	
	public static List<CountryDTO> countriesStub(){
		List<CountryDTO> countries = new ArrayList<>();
		CountryDTO italy = new CountryDTOImpl();
		italy.setId(1);
		italy.setCountry("Italy");
		CountryDTO germany = new CountryDTOImpl();
		germany.setId(2);
		germany.setCountry("Germany");
		CountryDTO usa = new CountryDTOImpl();
		usa.setId(3);
		usa.setCountry("Usa");
		CountryDTO unitedKingdom = new CountryDTOImpl();
		unitedKingdom.setId(4);
		unitedKingdom.setCountry("United Kingdom");
		CountryDTO france = new CountryDTOImpl();
		france.setId(5);
		france.setCountry("France");
		countries.add(france);
		countries.add(germany);
		countries.add(italy);
		countries.add(unitedKingdom);
		countries.add(usa);
		return countries;
	}

}
