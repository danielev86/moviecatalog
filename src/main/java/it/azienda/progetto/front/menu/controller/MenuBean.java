package it.azienda.progetto.front.menu.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import it.azienda.progetto.dto.UserDTO;
import it.azienda.progetto.front.login.controller.LoginBean;

@ManagedBean(name = "menuBean")
@ViewScoped
public class MenuBean implements Serializable {

	private boolean showMenu;
	private UserDTO user;
	

	@PostConstruct
	public void initMenuHome() {
		showMenu = false;
//		user = (UserDTO) session.getAttribute("userInSession");
	
	}

	public boolean isShowMenu() {
		return showMenu;
	}

	public void setShowMenu(boolean showMenu) {
		this.showMenu = showMenu;
	}


	public void renderMenuHome() {
		if (!showMenu) {
			showMenu = true;
		} else {
			showMenu = false;
		}

	}

	public String refreshMenu() {
		return null;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
	
	public String insertStar(){
		return "insertStarMenu";
	}
	
	public String insertFilm(){
		System.out.println("Entra");
		return "insertFilmMenu";
	}

}
