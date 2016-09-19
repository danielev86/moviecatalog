package it.azienda.progetto.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.hibernate.bean.Country;

@Repository("countryDAO")
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
public class CountryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Country retrieveCountryByName(String country){
		Query query = sessionFactory.getCurrentSession().createQuery("FROM CountryImpl c WHERE c.country=:countryParam");
		query.setParameter("countryParam", country);
		return (Country) query.list().get(0);
	}
	
	public List<Country> retrieveAllCountry(){
		return (List<Country>) sessionFactory.getCurrentSession().createQuery("FROM CountryImpl c ORDER BY c.country").list();
	}
	
	

}
