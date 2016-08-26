package it.azienda.progetto.bean.controller.menu;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "menuBean")
@ViewScoped
public class MenuBean implements Serializable {

	private boolean showMenu;

	@PostConstruct
	public void initMenuHome() {
		showMenu = false;
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
	
	public String refreshMenu(){
		return null;
	}

}
