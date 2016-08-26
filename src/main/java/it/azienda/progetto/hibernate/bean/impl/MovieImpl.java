package it.azienda.progetto.hibernate.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import it.azienda.progetto.hibernate.bean.Company;
import it.azienda.progetto.hibernate.bean.Country;
import it.azienda.progetto.hibernate.bean.Genre;
import it.azienda.progetto.hibernate.bean.Movie;
import it.azienda.progetto.hibernate.bean.Rating;
import it.azienda.progetto.hibernate.bean.Star;

public class MovieImpl implements Movie , Serializable{

	private Integer id;
	private String title;
	private Date releaseDate;
	private String plot;
	private String poster;
	private Company company;
	private Set<Rating> ratings;
	private Set<Genre> genres;
	private Set<Star> directors;
	private Set<Star> actors;
	private Set<Country> countries;
	
	public MovieImpl(){
		ratings = new HashSet<>();
		genres = new HashSet<>();
		directors = new HashSet<>();
		countries = new HashSet<>();
		actors = new HashSet<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Set<Rating> getRatings() {
		return ratings;
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	public void setRatings(Set<Rating> ratings) {
		this.ratings = ratings;
	}

	public Set<Genre> getGenres() {
		return genres;
	}

	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
	}

	public Set<Star> getDirectors() {
		return directors;
	}

	public void setDirectors(Set<Star> directors) {
		this.directors = directors;
	}

	public Set<Star> getActors() {
		return actors;
	}

	public void setActors(Set<Star> actors) {
		this.actors = actors;
	}
	
	

}
