package net.codejava.struts;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String email;
	private String password;

	public String execute() {
		if (email != null && email.equals("admin@codejava.net")) {
			return SUCCESS;			
		} else {
			return INPUT;
		}
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}