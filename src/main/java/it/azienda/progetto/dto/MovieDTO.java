package it.azienda.progetto.dto;

import java.util.Date;
import java.util.Set;


public interface MovieDTO {

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

	public CompanyDTO getCompany();

	public void setCompany(CompanyDTO company);

	public Set<RatingDTO> getRatings();

	public void setRatings(Set<RatingDTO> ratings);

	public Set<GenreDTO> getGenres();

	public void setGenres(Set<GenreDTO> genres);

	public Set<StarDTO> getDirectors();

	public void setDirectors(Set<StarDTO> directors);

	public Set<StarDTO> getActors();

	public void setActors(Set<StarDTO> actors);

	public Set<CountryDTO> getCountries();

	public void setCountries(Set<CountryDTO> countries);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

}
