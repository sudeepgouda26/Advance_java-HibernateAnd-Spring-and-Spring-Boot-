package com.embedable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UsnDet {
	@Id
	private String usn;
	
	@Column(nullable = false, unique = false)
	private String branch;
	@OneToOne
	private Student s1;

	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student getS1() {
		return s1;
	}
	public void setS1(Student s1) {
		this.s1 = s1;
	}
	

}
