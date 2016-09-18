package it.azienda.progetto.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.dto.RoleDTO;
import it.azienda.progetto.dto.UserDTO;
import it.azienda.progetto.dto.impl.RoleDTOImpl;
import it.azienda.progetto.dto.impl.UserDTOImpl;
import it.azienda.progetto.hibernate.bean.User;
import it.azienda.progetto.hibernate.dao.UserDAO;

@Service("userService")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserService {

	@Autowired
	private UserDAO userDao;

	public UserService(){
	}
	
	public String getPrimo() {
		return userDao.retrieveAllUser().get(0).getUsername();
	}

//	public UserDAO getUserDao() {
//		return userDao;
//	}
//
//	public void setUserDao(UserDAO userDao) {
//		this.userDao = userDao;
//	}
	
	public void stampa(){
		System.out.println("--------Stampami--------------");
	}

	public UserDTO retrieveUserToLogin(String username, String password){
//		UserDAO userDao = this.getUserDao();
		User user = this.userDao.retrieveUser(username, password);
		if (user!=null){
			UserDTO userRetrieve = new UserDTOImpl();
			userRetrieve.setId(user.getId());
			userRetrieve.setFirstName(user.getFirstName());
			userRetrieve.setLastName(user.getLastName());
			userRetrieve.setUsername(user.getUsername());
			userRetrieve.setPassword(user.getPassword());
			userRetrieve.setEmail(user.getEmail());
			RoleDTO roleTmp = new RoleDTOImpl();
			roleTmp.setId(user.getRole().getId());
			roleTmp.setRole(user.getRole().getRole());
			userRetrieve.setRole(roleTmp);
			return userRetrieve;
		}else{
			return null;
		}
	}

}
