package com.embedable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity(name = "resultTable")
public class Student {
	@Id
	private  int stdId;
	@Embedded
	private  StudentName stdName;
	@Column(nullable =false,unique = false )
	private int marks;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public StudentName getStdName() {
		return stdName;
	}
	public void setStdName(StudentName stdName) {
		this.stdName = stdName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
