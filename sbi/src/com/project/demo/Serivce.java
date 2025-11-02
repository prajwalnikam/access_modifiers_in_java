package com.project.demo;



public class Serivce  extends EmployeeService{

	@Override
	public void display() {
		System.out.println("Student name is :"+this.s2.getName());
		System.out.println("Student Flat No is: "+s2.getAddress());
		
	}

}
