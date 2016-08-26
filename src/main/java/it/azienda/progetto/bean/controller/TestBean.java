package it.azienda.progetto.bean.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import it.azienda.progetto.hibernate.bean.User;
import it.azienda.progetto.hibernate.service.UserService;

@ManagedBean
@ViewScoped
public class TestBean {
	
	@ManagedProperty(value="#{userService}")
	private UserService userService;
	private String hello;
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init(){
		hello="ciao";
		
		System.out.println(userService.getPrimo());
		
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	
	

}
