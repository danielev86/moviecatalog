package it.azienda.progetto.front.crud.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.TabChangeEvent;

import it.azienda.progetto.dto.CountryDTO;
import it.azienda.progetto.dto.GenreDTO;
import it.azienda.progetto.dto.MovieDTO;
import it.azienda.progetto.dto.StarDTO;
import it.azienda.progetto.dto.impl.MovieDTOImpl;
import it.azienda.progetto.hibernate.service.CountryService;
import it.azienda.progetto.hibernate.service.GenreService;
import it.azienda.progetto.hibernate.service.StarService;

@ManagedBean(name="movieBean")
@ViewScoped
public class MovieBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private MovieDTO movie;
	private Set<StarDTO> stars;
	private Set<StarDTO> directors;
	private List<CountryDTO> countries;
	private List<GenreDTO> genres;
	private List<CountryDTO> countrySelect;
	private List<GenreDTO> genreSelect;
	
	@ManagedProperty(value="#{genreService}")
	private GenreService genreService;
	@ManagedProperty(value="#{countryService}")
	private CountryService countryService;
	@ManagedProperty(value="#{starService}")
	private StarService starService;
	
	private String url;
	
	@PostConstruct
	public void movieInitializer(){
		movie = new MovieDTOImpl();
		url="";
		stars = new HashSet<>();
		directors = new HashSet<>();
		countries = new ArrayList<>();
		genres = new ArrayList<>();
		countrySelect = countryService.retrieveAllCountry();
		genreSelect = genreService.retrieveAllGenre();
	}
	
	public MovieDTO getMovie() {
		return movie;
	}
	public void setMovie(MovieDTO movie) {
		this.movie = movie;
	}
	public Set<StarDTO> getStars() {
		return stars;
	}
	public void setStars(Set<StarDTO> stars) {
		this.stars = stars;
	}
	public Set<StarDTO> getDirectors() {
		return directors;
	}
	public void setDirectors(Set<StarDTO> directors) {
		this.directors = directors;
	}
	public GenreService getGenreService() {
		return genreService;
	}
	public void setGenreService(GenreService genreService) {
		this.genreService = genreService;
	}
	public CountryService getCountryService() {
		return countryService;
	}
	public void setCountryService(CountryService countryService) {
		this.countryService = countryService;
	}
	public StarService getStarService() {
		return starService;
	}
	public void setStarService(StarService starService) {
		this.starService = starService;
	}

	public List<CountryDTO> getCountrySelect() {
		return countrySelect;
	}

	public void setCountrySelect(List<CountryDTO> countrySelect) {
		this.countrySelect = countrySelect;
	}

	public List<GenreDTO> getGenreSelect() {
		return genreSelect;
	}

	public void setGenreSelect(List<GenreDTO> genreSelect) {
		this.genreSelect = genreSelect;
	}

	public List<CountryDTO> getCountries() {
		return countries;
	}

	public void setCountries(List<CountryDTO> countries) {
		this.countries = countries;
	}

	public List<GenreDTO> getGenres() {
		return genres;
	}

	public void setGenres(List<GenreDTO> genres) {
		this.genres = genres;
	}
	public void onTabChange(TabChangeEvent event){
		
	}
	
	
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void refreshPoster(){
		System.out.println(this.movie.getPoster());

	}
	
	
	
	
	
	
	
	

}
