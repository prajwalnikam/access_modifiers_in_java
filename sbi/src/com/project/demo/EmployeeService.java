package com.project.demo;

import java.util.Scanner;

public  abstract class EmployeeService implements P1,P2 {
	Address a1=new Address();
	Student s2=new Student();
	@Override
	public void getData()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name=s1.next();
		System.out.println("Enter Flat no");
		int flatNo=s1.nextInt();

		a1.setFlatNo(flatNo);

		s2.setName(name);
		s2.setAddress(a1);

	}
}
