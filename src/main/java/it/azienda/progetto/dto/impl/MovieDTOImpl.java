package it.azienda.progetto.dto.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import it.azienda.progetto.dto.CompanyDTO;
import it.azienda.progetto.dto.CountryDTO;
import it.azienda.progetto.dto.GenreDTO;
import it.azienda.progetto.dto.MovieDTO;
import it.azienda.progetto.dto.RatingDTO;
import it.azienda.progetto.dto.StarDTO;

public class MovieDTOImpl implements MovieDTO, Serializable {
	
	private Integer id;
	private String title;
	private Date releaseDate;
	private String plot;
	private String poster;
	private CompanyDTO company;
	private Set<RatingDTO> ratings;
	private Set<GenreDTO> genres;
	private Set<StarDTO> directors;
	private Set<StarDTO> actors;
	private Set<CountryDTO> countries;
	
	public MovieDTOImpl (){
		ratings = new HashSet<>();
		genres = new HashSet<>();
		directors = new HashSet<>();
		actors = new HashSet<>();
		countries = new HashSet<>();
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

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public Set<RatingDTO> getRatings() {
		return ratings;
	}

	public void setRatings(Set<RatingDTO> ratings) {
		this.ratings = ratings;
	}

	public Set<GenreDTO> getGenres() {
		return genres;
	}

	public void setGenres(Set<GenreDTO> genres) {
		this.genres = genres;
	}

	public Set<StarDTO> getDirectors() {
		return directors;
	}

	public void setDirectors(Set<StarDTO> directors) {
		this.directors = directors;
	}

	public Set<StarDTO> getActors() {
		return actors;
	}

	public void setActors(Set<StarDTO> actors) {
		this.actors = actors;
	}

	public Set<CountryDTO> getCountries() {
		return countries;
	}

	public void setCountries(Set<CountryDTO> countries) {
		this.countries = countries;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actors == null) ? 0 : actors.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((countries == null) ? 0 : countries.hashCode());
		result = prime * result + ((directors == null) ? 0 : directors.hashCode());
		result = prime * result + ((genres == null) ? 0 : genres.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((plot == null) ? 0 : plot.hashCode());
		result = prime * result + ((poster == null) ? 0 : poster.hashCode());
		result = prime * result + ((ratings == null) ? 0 : ratings.hashCode());
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDTOImpl other = (MovieDTOImpl) obj;
		if (actors == null) {
			if (other.actors != null)
				return false;
		} else if (!actors.equals(other.actors))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (countries == null) {
			if (other.countries != null)
				return false;
		} else if (!countries.equals(other.countries))
			return false;
		if (directors == null) {
			if (other.directors != null)
				return false;
		} else if (!directors.equals(other.directors))
			return false;
		if (genres == null) {
			if (other.genres != null)
				return false;
		} else if (!genres.equals(other.genres))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (plot == null) {
			if (other.plot != null)
				return false;
		} else if (!plot.equals(other.plot))
			return false;
		if (poster == null) {
			if (other.poster != null)
				return false;
		} else if (!poster.equals(other.poster))
			return false;
		if (ratings == null) {
			if (other.ratings != null)
				return false;
		} else if (!ratings.equals(other.ratings))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	

}
