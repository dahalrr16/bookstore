package com.sang.model;

public class Account {
private	String uname;
	private String emailId;
private	String psw;
private	int age;
	
	protected Account(String uname, String emailId, String psw, int age) {
		this.uname = uname;
		this.emailId = emailId;
		this.psw = psw;
		this.age = age;
		
	}

	public Account() {
		
	}
	@Override
	public String toString() {
		return "AccountClass [uname=" + uname + ", emailId=" + emailId + ", psw=" + psw + ", age=" + age + "]";
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
