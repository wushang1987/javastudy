package com.wgh;

public class UserBean {
	private String name = "wangweidong";
	private String password = "123";
	private int shuxueNum;
	private int yingyuNum;
	private int zongfen;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setShuxueNum(int shuxueNum) {
		this.shuxueNum = shuxueNum;
	}
	public int getShuxueNum() {
		return shuxueNum;
	}
	public void setYingyuNum(int yingyuNum) {
		this.yingyuNum = yingyuNum;
	}
	public int getYingyuNum() {
		return yingyuNum;
	}
	public void setZongfen(int zongfen) {
		this.zongfen = zongfen;
	}
	public int getZongfen() {
		zongfen = shuxueNum + yingyuNum;
		return zongfen;
	}
}
