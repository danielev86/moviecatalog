package it.azienda.progetto.service.ws;

import org.springframework.stereotype.Service;

import it.azienda.progetto.ws.bean.MovieBean;

@Service("omdbService")
public class OMDBRestService {
	
	private MovieBean movieBean;

	public MovieBean getMovieBean() {
		return movieBean;
	}

	public void setMovieBean(MovieBean movieBean) {
		this.movieBean = movieBean;
	}
	
	public MovieBean retrieveMovieInfoFromImdb(String title){
		
		return this.getMovieBean();
	}

}
