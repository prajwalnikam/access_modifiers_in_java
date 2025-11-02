package com.irctc.login;

public class Parent {
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected int id;
	protected String name;
	protected void data()
	{
		System.out.println(this.id=10);
		System.out.println(this.name="joe");
	}
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.id=23;
		p1.data();
	}

}
