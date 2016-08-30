package it.azienda.progetto.bean.controller.login;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import it.azienda.progetto.dto.UserDTO;
import it.azienda.progetto.dto.impl.UserDTOImpl;

@ManagedBean(name = "signinBean")
@ViewScoped
public class SignInBean {

	private UserDTO userRegistration;

	@PostConstruct
	public void initRegistration(){
		this.userRegistration = new UserDTOImpl();
	}
	public UserDTO getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(UserDTO userRegistration) {
		this.userRegistration = userRegistration;
	}

}
