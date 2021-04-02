package com.zjl.ssm.bean;

public class Emp {
	private String eid;
	private String eName;
	private String password;
	private String telephone;
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Emp(String eid, String eName, String password, String telephone) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.password = password;
		this.telephone = telephone;
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
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", eName=" + eName + ", password=" + password + ", telephone=" + telephone + "]";
	}
	
}
