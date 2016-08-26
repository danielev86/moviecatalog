package it.azienda.progetto.ws.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "movie")
public class MovieBean {

	private String title;
	private String year;
	private String rated;
	private String release;
	private String runtime;
	private String genre;
	private String directors;
	private String writer;
	private String actors;
	private String plot;
	private String country;
	private String awards;
	private String poster;
	private String metascore;
	private String imdbRating;
	private String imdbVotes;
	private String imdbId;
	private String type;

	public String getTitle() {
		return title;
	}

	@XmlAttribute(name = "title")
	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	@XmlAttribute(name = "year")
	public void setYear(String year) {
		this.year = year;
	}

	public String getRated() {
		return rated;
	}

	@XmlAttribute(name = "rated")
	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getRelease() {
		return release;
	}

	@XmlAttribute(name = "release")
	public void setRelease(String release) {
		this.release = release;
	}

	public String getRuntime() {
		return runtime;
	}

	@XmlAttribute(name = "runtime")
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getGenre() {
		return genre;
	}

	@XmlAttribute(name = "genre")
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirectors() {
		return directors;
	}

	@XmlAttribute(name = "directors")
	public void setDirectors(String directors) {
		this.directors = directors;
	}

	public String getWriter() {
		return writer;
	}

	@XmlAttribute(name = "writer")
	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getActors() {
		return actors;
	}

	@XmlAttribute(name = "actors")
	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getPlot() {
		return plot;
	}

	@XmlAttribute(name = "plot")
	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getCountry() {
		return country;
	}

	@XmlAttribute(name = "country")
	public void setCountry(String country) {
		this.country = country;
	}

	public String getAwards() {
		return awards;
	}

	@XmlAttribute(name = "awards")
	public void setAwards(String awards) {
		this.awards = awards;
	}

	public String getPoster() {
		return poster;
	}

	@XmlAttribute(name = "poster")
	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getMetascore() {
		return metascore;
	}

	@XmlAttribute(name = "metascore")
	public void setMetascore(String metascore) {
		this.metascore = metascore;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	@XmlAttribute(name = "imdbRating")
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getImdbVotes() {
		return imdbVotes;
	}

	@XmlAttribute(name = "imdbVotes")
	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}

	public String getImdbId() {
		return imdbId;
	}

	@XmlAttribute(name = "imdbId")
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	@XmlAttribute(name = "type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
