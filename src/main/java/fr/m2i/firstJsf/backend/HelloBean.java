package fr.m2i.firstJsf.backend;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String message = "Aujourd'hui les températures sont stables";


	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
