package it.azienda.progetto.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.dto.StarDTO;
import it.azienda.progetto.dto.impl.StarDTOImpl;
import it.azienda.progetto.hibernate.bean.Country;
import it.azienda.progetto.hibernate.bean.Star;
import it.azienda.progetto.hibernate.bean.impl.CountryImpl;
import it.azienda.progetto.hibernate.bean.impl.StarImpl;
import it.azienda.progetto.hibernate.dao.StarDAO;

@Service("starService")
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
public class StarService {
	
	@Autowired
	@Qualifier("starDao")
	private StarDAO starDao;
	
	public boolean addStar(StarDTO starDto){
		Star star = new StarImpl();
		star.setFirstName(starDto.getFirstName());
		star.setLastName(starDto.getLastName());
		star.setBorn(starDto.getBorn());
		star.setBiography(starDto.getBiography());
		Country country = new CountryImpl();
		country.setId(starDto.getCountry().getId());
		country.setCountry(starDto.getCountry().getCountry());
		star.setCountry(country);
		try{
			starDao.addPerson(star);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public List<StarDTO> retrieveAllStar(){
		List<StarDTO> stars = new ArrayList<>();
		List<Star> listStars = starDao.retrieveAllPerson();
		for(Star it : listStars){
			StarDTO starTmp = new StarDTOImpl();
			starTmp.setId(it.getId());
			starTmp.setFirstName(it.getFirstName());
			starTmp.setLastName(it.getLastName());
			starTmp.setBorn(it.getBorn());
			starTmp.setBiography(it.getBiography());
			stars.add(starTmp);
		}
		return stars;
	}
	

}
