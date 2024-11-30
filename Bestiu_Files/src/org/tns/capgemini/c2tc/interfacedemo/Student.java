package org.tns.capgemini.c2tc.interfacedemo;

public class Student implements Registerable
{
	
	private int id;
	private String name;
	private double fees;
	private String course;
	
	public Student(int id, String name, double fees, String course) {
		
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}