package it.azienda.progetto.bean.controller.menu;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import it.azienda.progetto.bean.controller.login.LoginBean;
import it.azienda.progetto.dto.UserDTO;

@ManagedBean(name = "menuBean")
@ViewScoped
public class MenuBean implements Serializable {

	private boolean showMenu;
	private UserDTO user;
	

	@PostConstruct
	public void initMenuHome() {
		showMenu = false;
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		user = (UserDTO) session.getAttribute("userInSession");
	
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
	
	

}
