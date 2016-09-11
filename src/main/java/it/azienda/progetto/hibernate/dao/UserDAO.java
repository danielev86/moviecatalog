package it.azienda.progetto.hibernate.dao;


import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.hibernate.bean.Role;
import it.azienda.progetto.hibernate.bean.User;
import it.azienda.progetto.hibernate.bean.impl.RoleImpl;
import it.azienda.progetto.hibernate.bean.impl.UserImpl;

@Repository("userDAO")
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
public class UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public UserDAO(){
	
	}
	public List<User> retrieveAllUser(){

		return (List<User>) sessionFactory.openSession().createQuery("From UserImpl").list();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public User retrieveUser(String username, String password){
		Query query= sessionFactory.getCurrentSession().createSQLQuery("SELECT u.*, r.role FROM users as u join roles as r ON u.user_id=r.id WHERE username=:username AND password=md5(:password)");
		query.setParameter("username", username);
		query.setParameter("password", password);
		List<Object> userList = (List<Object>) query.list();
		
		User userRes = new UserImpl();
		if (!userList.isEmpty()){
			Object[] row = (Object[]) userList.get(0);
			userRes.setId((Integer) row[0]);
			userRes.setFirstName((String) row[1]);
			userRes.setLastName((String) row[2]);
			userRes.setUsername((String) row[3]);
			userRes.setPassword((String) row[4]);
			userRes.setEmail((String)row[5]);
			Role role = new RoleImpl();
			role.setId(((Integer) row[6]).intValue());
			role.setRole((String) row[7]);
			userRes.setRole(role);
			return userRes;
		}else{
			return null;
		}
		
		
	}
	
	public void insertUser(User user){
		
		sessionFactory.openSession().save(user);
	}

}
