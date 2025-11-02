package com.amazon.demo;


import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Case One");
			System.out.println("2.Case Two");
			System.out.println("3.Case Three");
			System.out.println("4.Case Four");
			System.out.println("Enter Your choice");
			String x=s1.next();
			switch (x) {
			case "One": {

				System.out.println("Hello this is case one");
				break;
			}
			case "Two":
			{
				System.out.println("Hello this is case Two");
				break;
			}
			case "Three": {

				System.out.println("Hello this is case Three");
				break;
			}
			case "Four":
			{
				System.out.println("Hello this is case Four");
				break;
			}
			default:
				System.out.println("In valid input please enter valid data");
			}

		}
	}
}
