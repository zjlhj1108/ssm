package com.zjl.ssm.bean;

public class Emp {
	private String eid;
	private String eName;
	private String password;
	private String telephone;
	private String gender;
	private Dept dept;
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Emp(String eid, String eName, String password, String telephone, String gender, Dept dept) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.password = password;
		this.telephone = telephone;
		this.gender = gender;
		this.dept = dept;
	}

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	public Dept getDept() {
		return dept;
	}


	public void setDept(Dept dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", eName=" + eName + ", password=" + password + ", telephone=" + telephone
				+ ", gender=" + gender + ", dept=" + dept + "]";
	}
	
}
