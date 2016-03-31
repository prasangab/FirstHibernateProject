package com.prasanga.hibernate;

//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.Transient;

@Entity
@Table(name="STUDENT")
public class Student {

	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	
	//@Transient
	@Column(name="Full_Name",nullable=false)
	private String student_name;
	
	//@Temporal(TemporalType.DATE)
	//private Date birthDate;
	
	//public Date getBirthDate() {
	//	return birthDate;
	//}
	//public void setBirthDate(Date birthDate) {
	//	this.birthDate = birthDate;
	//}
	public int getStudent_id() {
		return student_id;
	}
	public void setstudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	

}
