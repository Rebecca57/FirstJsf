package fr.m2i.firstJsf.backend;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class NavBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public String pageAbout() {
		return "about?faces-redirect=true";
	}
	
	public String pageIndex() {
		return "index?faces-redirect=true";
	}
	
	public String pageLogin() {
		return "login?faces-redirect=true";
	}

	

}
