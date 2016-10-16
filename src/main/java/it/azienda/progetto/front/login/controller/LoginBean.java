package it.azienda.progetto.front.login.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.context.RequestContext;
import org.springframework.security.web.WebAttributes;

import it.azienda.progetto.common.utils.UtilityFunction;
import it.azienda.progetto.dto.UserDTO;
import it.azienda.progetto.hibernate.service.UserService;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

	@ManagedProperty(value = "#{userService}")
	private UserService userService;
	private String username;
	private String password;
	private UserDTO user;

	@PostConstruct
	public void init() {

	}

	public void openDialog() {
		System.out.println("------");
		RequestContext.getCurrentInstance().execute("PF('pnlSignin').show();");
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
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		HttpServletRequest request = ((HttpServletRequest) context.getRequest());
		user = userService.retrieveUserToLogin(username, password);
		ServletResponse resposnse = ((ServletResponse) context.getResponse());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/j_spring_security_check");
		try {
			dispatcher.forward(request, resposnse);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FacesContext.getCurrentInstance().responseComplete();

		return null;
	}

	public String logout() {

		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

		return "logout";
	}

	public void updateMessages(boolean update) throws Exception {
		System.out.println("Start LoginBean.updateMessages");
		Exception ex = (Exception) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get(WebAttributes.AUTHENTICATION_EXCEPTION);

		if (ex != null) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, UtilityFunction.getBundle().getString("error.username.nouser"), UtilityFunction.getBundle().getString("error.username.nouser")));
		}
	}

}
