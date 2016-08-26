package it.azienda.progetto.dto.impl;

import java.io.Serializable;

import it.azienda.progetto.dto.MovieDTO;
import it.azienda.progetto.dto.RatingDTO;
import it.azienda.progetto.dto.UserDTO;

public class RatingDTOImpl implements RatingDTO, Serializable {

	private Integer id;
	private int rate;
	private String comment;
	private MovieDTO movie;
	private UserDTO user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public MovieDTO getMovie() {
		return movie;
	}

	public void setMovie(MovieDTO movie) {
		this.movie = movie;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

}
