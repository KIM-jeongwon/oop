package com.kabank.web.service;

public class Memberservice {
	private int customNum;
	private String name;
	private int age;
	private String gender;
	private String ssn;
public Memberservice() {
			this.customNum = 0;
			this.name = "";
			this.age = 0;
			this.gender = "";
			this.ssn = "";
	}
	public void setCustomNum() {
			this.customNum = 101;
	}
	public int getCustomNum() {
			return this.customNum;
	}
	public void setName(String name) {
			this.name = name;
	}
	public String getName() {
			return this.name;
	}
	public void setAge() {
			this.age = 0;
	}
	public int getAge() {
			return this.age;
	}
	public void setGender() {
			
			this.gender = this.ssn;
			char ch = ' ';
			ch = this.ssn.charAt(7);
			
		switch(ch) {
			case '1' : 
			case '3' : 
				gender = "남자";
				break;
			case '2' : 
			case '4' :
				gender = "여자";
				break;
			case '5' :
			case '6' :
				gender = "외국인";
				break;
		}
	}
	public String getGender() {
			return this.gender;
	}
	
	public void setSsn(String ssn) {
			this.ssn = ssn;
	}
	public String getSsn() {
			return this.ssn;
	}
		}
