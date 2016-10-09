package it.azienda.progetto.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.hibernate.bean.Genre;

@Repository("genreDao")
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
public class GenreDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Genre> retrieveAllGenres(){
		return (List<Genre>) sessionFactory.getCurrentSession().createQuery("FROM GenreImpl g ORDER BY g.genre").list();
	}

}
