package it.azienda.progetto.dto;

public interface RatingDTO {

	public Integer getId();

	public void setId(Integer id);

	public int getRate();

	public void setRate(int rate);

	public String getComment();

	public void setComment(String comment);

	public MovieDTO getMovie();

	public void setMovie(MovieDTO movie);

	public UserDTO getUser();

	public void setUser(UserDTO user);

}
