package it.azienda.progetto.crud.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import it.azienda.progetto.dto.StarDTO;
import it.azienda.progetto.hibernate.service.StarService;

@ManagedBean(name="personStarSearchController")
@ViewScoped
public class PersonStarSearchBean {
	
	@ManagedProperty(value="#{starService}")
	private StarService starService;
	
	private List<StarDTO> actors;
	
	@PostConstruct
	public void initSearchActor(){
		actors = starService.retrieveAllStar();
	}
	

	public StarService getStarService() {
		return starService;
	}



	public void setStarService(StarService starService) {
		this.starService = starService;
	}



	public List<StarDTO> getActors() {
		return actors;
	}

	public void setActors(List<StarDTO> actors) {
		this.actors = actors;
	}
	
	

}
