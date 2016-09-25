package it.azienda.progetto.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.hibernate.bean.Star;

@Repository("starDao")
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
public class StarDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addPerson(Star star){
		sessionFactory.getCurrentSession().save(star);
	}
	
	public List<Star> retrieveAllPerson(){
		return (List<Star>) sessionFactory.getCurrentSession().createQuery("FROM StarImpl ORDER BY firstName, lastName").list();
	}

}
