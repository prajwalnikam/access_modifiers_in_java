package com.sbi.login;

public class Home {

	int id;
	String name;
	void demo()
	{
		System.out.println(this.id=121);
		System.out.println(this.name="hi");

	}

	 public static void main(String[] args) {
		Home h1=new Home();
		h1.id=120;
		h1.name="max";
		h1.demo();
	}

}
