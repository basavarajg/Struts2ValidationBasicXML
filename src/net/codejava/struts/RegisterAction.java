package net.codejava.struts;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String email;  


    public String getEmail() {  
        return email;  
    }  


    public void setEmail(String email) {  
        this.email = email;  
    }  


    public String execute(){  
        return "success";  
    }	
}