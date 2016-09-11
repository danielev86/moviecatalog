package it.azienda.progetto.bean.controller.login;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import it.azienda.progetto.common.utils.UtilityFunction;
import it.azienda.progetto.dto.RoleDTO;
import it.azienda.progetto.dto.UserDTO;
import it.azienda.progetto.dto.impl.RoleDTOImpl;
import it.azienda.progetto.dto.impl.UserDTOImpl;
import it.azienda.progetto.hibernate.service.UserService;

@ManagedBean(name = "loginBean")
@javax.faces.bean.SessionScoped
public class LoginBean implements Serializable {
	
	@ManagedProperty(value="#{userService}")
	private UserService userService;

	private String username;
	private String password;
	private UserDTO user;

	@PostConstruct
	public void init(){

	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String update() {
		FacesContext context = FacesContext.getCurrentInstance();
		userService.stampa();
		user = userService.retrieveUserToLogin(username, password);
		if(user!=null){
//			HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
//			session.setAttribute("userInSession", user);			
			return null;
		}else {
			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.username.nouser"), UtilityFunction.getBundle().getString("error.username.nouser"));
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, message);
			return null;
		}
	}
	
	
	
	public String logout(){

		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

		return "logout";
	}

}
