package it.azienda.progetto.hibernate.bean.impl;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import it.azienda.progetto.hibernate.bean.Role;
import it.azienda.progetto.hibernate.bean.User;

public class RoleImpl implements Role, Serializable {
	private Integer id;
	private String role;
	private Set<User> users;

	public RoleImpl() {
		users = new HashSet<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
