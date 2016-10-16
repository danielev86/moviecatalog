package it.azienda.progetto.security.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.common.utils.UtilityFunction;
import it.azienda.progetto.front.login.controller.LoginBean;
import it.azienda.progetto.hibernate.bean.User;
import it.azienda.progetto.hibernate.dao.UserDAO;
@Service("AppUserDetailsService")
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
public class AppUserDetailsService implements UserDetailsService{
	
	@Autowired
	@Qualifier("userDAO")
	private UserDAO userDao;
	
	
	public static class UserDetailsImpl implements UserDetails {

		private static final long serialVersionUID = 1L;

		private Collection<? extends GrantedAuthority> authorities;
		private String password;
		private String username;
		private boolean accountNonExpired;
		private boolean accountNonLocked;
		private boolean credentialsNonExpired;
		private boolean enabled;
		
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return authorities;
		}

		@Override
		public String getPassword() {
			return password;
		}

		@Override
		public String getUsername() {
			return username;
		}

		@Override
		public boolean isAccountNonExpired() {
			return accountNonExpired;
		}

		@Override
		public boolean isAccountNonLocked() {
			return accountNonLocked;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return credentialsNonExpired;
		}

		@Override
		public boolean isEnabled() {
			return enabled;
		}

		public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
			this.authorities = authorities;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public void setAccountNonExpired(boolean accountNonExpired) {
			this.accountNonExpired = accountNonExpired;
		}

		public void setAccountNonLocked(boolean accountNonLocked) {
			this.accountNonLocked = accountNonLocked;
		}

		public void setCredentialsNonExpired(boolean credentialsNonExpired) {
			this.credentialsNonExpired = credentialsNonExpired;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = null;
		try{
			System.out.println(username);
			user = userDao.retrieveUserByUsername(username);
			System.out.println(user.getUsername()+" "+user.getPassword()+" "+user.getRole().getRole());
		}catch(Exception e){
			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.username.nouser"), UtilityFunction.getBundle().getString("error.username.nouser"));
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext ctx = FacesContext.getCurrentInstance();
			ctx.addMessage(null, message);
			
		}
		
		if (user==null) {
			
			FacesMessage message = new FacesMessage(UtilityFunction.getBundle().getString("error.username.nouser"), UtilityFunction.getBundle().getString("error.username.nouser"));
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext ctx = FacesContext.getCurrentInstance();
			ctx.addMessage(null, message);
			throw new UsernameNotFoundException(username + " not found");
		}
		
		UserDetailsImpl userDetail = new UserDetailsImpl();
		userDetail.setUsername(username);
		userDetail.setPassword(user.getPassword());
		userDetail.setEnabled(true);
		userDetail.setCredentialsNonExpired(true);
		userDetail.setAccountNonExpired(true);
		userDetail.setAccountNonLocked(true);
		
		List<SimpleGrantedAuthority> auths = new ArrayList<SimpleGrantedAuthority>();
		
		if (user.getRole().getRole().equals("admin")){
			auths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			System.out.println("Porco");
		}else{
			auths.add(new SimpleGrantedAuthority("ROLE_USER"));
		}
		
		userDetail.setAuthorities(auths);
		
		
		return userDetail;
	}

}
