package it.azienda.progetto.hibernate.bean;

import java.util.Date;
import java.util.Set;

public interface Movie {

	public Integer getId();

	public void setId(Integer id);

	public String getTitle();

	public void setTitle(String title);

	public Date getReleaseDate();

	public void setReleaseDate(Date releaseDate);

	public String getPlot();

	public void setPlot(String plot);

	public String getPoster();

	public void setPoster(String poster);

	public Company getCompany();

	public void setCompany(Company company);

	public Set<Rating> getRatings();

	public void setRatings(Set<Rating> ratings);

	public Set<Genre> getGenres();

	public void setGenres(Set<Genre> genres);

	public Set<Star> getDirectors();

	public void setDirectors(Set<Star> directors);

	public Set<Star> getActors();

	public void setActors(Set<Star> actors);

	public Set<Country> getCountries();

	public void setCountries(Set<Country> countries);

}
