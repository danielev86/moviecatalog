package it.azienda.progetto.hibernate.bean;

public interface Rating {

	public Integer getId();

	public void setId(Integer id);

	public int getRate();

	public void setRate(int rate);

	public String getComment();

	public void setComment(String comment);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

	public Movie getMovie();

	public void setMovie(Movie movie);

	public User getUser();

	public void setUser(User user);
}
