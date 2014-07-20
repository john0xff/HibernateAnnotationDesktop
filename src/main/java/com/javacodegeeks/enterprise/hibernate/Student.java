package com.javacodegeeks.enterprise.hibernate;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student", catalog = "tutorials")
public class Student implements java.io.Serializable
{

	private static final long serialVersionUID = 1L;

	private Integer studentId;
	private String studentName;
	private String studentAge;

	public Student()
	{
	}

	public Student(String studentName, String studentAge)
	{
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "STUDENT_ID", unique = true, nullable = false)
	public Integer getStudentId()
	{
		return this.studentId;
	}

	public void setStudentId(Integer studentId)
	{
		this.studentId = studentId;
	}

	@Column(name = "STUDENT_NAME", nullable = false, length = 10)
	public String getStudentName()
	{
		return this.studentName;
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}

	@Column(name = "STUDENT_AGE", nullable = false, length = 20)
	public String getStudentAge()
	{
		return this.studentAge;
	}

	public void setStudentAge(String studentAge)
	{
		this.studentAge = studentAge;
	}

}