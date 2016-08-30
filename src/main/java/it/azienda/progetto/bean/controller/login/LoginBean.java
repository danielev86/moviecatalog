package it.azienda.progetto.bean.controller.login;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import it.azienda.progetto.common.utils.UtilityFunction;
import it.azienda.progetto.dto.RoleDTO;
import it.azienda.progetto.dto.UserDTO;
import it.azienda.progetto.dto.impl.RoleDTOImpl;
import it.azienda.progetto.dto.impl.UserDTOImpl;

@ManagedBean(name = "loginBean")
@ViewScoped
public class LoginBean implements Serializable {

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

	public String update() {
		if(user!=null){
			System.out.println(user.getFirstName());
		}
		if (username.length() > 25) {
		} else {
			user = new UserDTOImpl();
			user.setFirstName("Tizio");
			user.setLastName("Ingcognito");
			RoleDTO role = new RoleDTOImpl();
			role.setId(1);
			role.setRole("user");
			user.setRole(role);
			HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
			session.setAttribute("userInSession", user);
		}

	
		return null;
	}
	
	public String logout(){

		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

		return "logout";
	}

}
