package com.websystique.springmvc.security;

import java.io.Serializable;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * CLase para  autenticar con el servicio de la DINARDAP
 * @author Cristhian Acurio
 *
 */
public class Auth extends Authenticator implements Serializable {
	
	private String User;
	private String passwd;
	
	public Auth(String user, String passwd) {
		super();
		User = user;
		this.passwd = passwd;
	}
	
	protected PasswordAuthentication getPasswordAuthentication() {
		
		return new PasswordAuthentication(User, passwd.toCharArray());
		
		
	}
	
	
	
}
