package com.wgh;

public class LoginAction {
	private String username;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
	
	public String execute() throws Exception{
		if(getUsername().equals("www")){
			return "success";
		}else{
			return "error";
		}
	}

}
