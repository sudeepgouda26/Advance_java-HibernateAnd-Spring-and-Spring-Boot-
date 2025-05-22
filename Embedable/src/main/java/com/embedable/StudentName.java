package com.embedable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
//	@Column(nullable = false ,unique = false)
	private String fName;
//	@Column(nullable = false ,unique = false)
	private String lname;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
