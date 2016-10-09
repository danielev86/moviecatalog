package it.azienda.progetto.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.dto.GenreDTO;
import it.azienda.progetto.dto.impl.GenreDTOImpl;
import it.azienda.progetto.hibernate.bean.Genre;
import it.azienda.progetto.hibernate.dao.GenreDAO;

@Service("genreService")
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
public class GenreService {
	
	@Autowired
	@Qualifier("genreDao")
	private GenreDAO genreDAO;
	
	public List<GenreDTO> retrieveAllGenre(){
		List<GenreDTO> genres = new ArrayList<>();
		for (Genre iter: genreDAO.retrieveAllGenres()){
			GenreDTO genre = new GenreDTOImpl();
			genre.setId(iter.getId());
			genre.setGenre(iter.getGenre());
			genres.add(genre);
		}
		return genres;
	}

}
