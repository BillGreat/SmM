package com.zlj.springmvcMybatis01.entity;

public class UserVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7207595174209834603L;
	
	private String userName;
	private String passWord;
	private String userId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String toString(){
		return "userId:"+userId+" ,userName:"+userName+" ,passWord:"+passWord;
	}
}
