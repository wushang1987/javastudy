package com.wgh;

public class UserBean {
	private String name = "wangweidong";   //用户名
	private String password = "123";   //密码
	private int shuxueNum;      //数学成绩
	private int yingyuNum;     //英语成绩
	private int zongfen;		//总分
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
