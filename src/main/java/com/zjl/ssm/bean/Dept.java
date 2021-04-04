package com.zjl.ssm.bean;

public class Dept {
	
	private String did;
	private String dName;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(String did, String dName) {
		super();
		this.did = did;
		this.dName = dName;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dName=" + dName + "]";
	}
	
	

}
