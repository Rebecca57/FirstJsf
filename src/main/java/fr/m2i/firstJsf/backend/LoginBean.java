package fr.m2i.firstJsf.backend;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class LoginBean implements Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		private String username;
		private String password;
		private boolean logged;
		
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
		public boolean isLogged() {
			return logged;
		}
		public void setLogged(boolean logged) {
			this.logged = logged;
		}
		
		public void login() {
			this.logged = true;
		}
}
