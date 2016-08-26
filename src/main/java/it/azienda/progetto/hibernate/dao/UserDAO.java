package it.azienda.progetto.hibernate.dao;


import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
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

	public List<User> retrieveAllUser(){
		HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
		return (List<User>) hibernateTemplate.find("From UserImpl");
	}
	
	public User retrieveUser(final User user){
		HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
		List<Object> userList = (List<Object>) hibernateTemplate.executeFind(new HibernateCallback<Object>() {

			@Override
			public List<Object> doInHibernate(Session session) throws HibernateException, SQLException {
				Query query= session.createSQLQuery("SELECT u.*, r.role FROM moviecatalog.users as u join moviecatalog.roles as r ON u.user_id=r.id WHERE username=:username AND password=md5(:password)");
				query.setParameter("username", user.getUsername());
				query.setParameter("password", user.getPassword());
				return query.list();
			}
		});
		
		User userRes = new UserImpl();
		if (!userList.isEmpty()){
			Object[] row = (Object[]) userList.get(0);
			userRes.setId(((BigDecimal) row[0]).intValue());
			userRes.setFirstName((String) row[1]);
			userRes.setLastName((String) row[2]);
			userRes.setUsername((String) row[3]);
			userRes.setPassword((String) row[4]);
			userRes.setEmail((String)row[5]);
			Role role = new RoleImpl();
			role.setId(((BigDecimal)row[6]).intValue());
			role.setRole((String) row[7]);
			userRes.setRole(role);
			return userRes;
		}else{
			return null;
		}
		
		
	}

}
