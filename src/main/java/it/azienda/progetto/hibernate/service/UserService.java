package it.azienda.progetto.hibernate.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.hibernate.dao.UserDAO;

@Service("userService")
@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
public class UserService {
	
	@Autowired
	@Qualifier(value="userDAO")
	private UserDAO userDao;
	
	public String getPrimo(){
		return userDao.retrieveAllUser().get(0).getUsername();
	}
	
	

}
