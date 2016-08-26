package it.azienda.progetto.hibernate.bean.impl;

import java.io.Serializable;

import it.azienda.progetto.hibernate.bean.Genre;

public class GenreImpl implements Genre, Serializable{
	private Integer id;
	private String genre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
