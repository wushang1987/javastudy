package com.wgh;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class UserInfoFrace implements HttpSessionBindingListener {
	private String user;
	private UserInfoList container = UserInfoList.getInstance();
	public UserInfoFrace(){
		setUser("");
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

}