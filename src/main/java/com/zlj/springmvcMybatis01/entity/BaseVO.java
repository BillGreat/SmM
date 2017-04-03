package com.zlj.springmvcMybatis01.entity;

import java.io.Serializable;

public class BaseVO implements Serializable {

	/**
	 * ÊµÀý»¯ID
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String userId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
