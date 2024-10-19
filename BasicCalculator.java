package com.calci;

import java.util.Scanner;

public class BasicCalculator{
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("***** Basic Calculator Java Console *****");
		Calci();
	}

	public static void Calci() {
		System.out.println("\nChoose an option below:");
		System.out.println("1)Addition (+)");
		System.out.println("2)Substraction (-)");
		System.out.println("3)Multiplication (X)");
		System.out.println("4)Division (/)");
		System.out.println("5)Close");
		
		int op=sc.nextInt();
		
		if (op>=1 && op<=5) {
			Operation(op);
			
		} else {
			System.out.println("Wrong Choice \nLet's try again");
			Calci();
		}
		Continue();
	}

	private static void Continue() {
		System.out.println("\nIf you want to continue enter Y or else N");
		char ch=sc.next().charAt(0);
		if (ch=='y'||ch=='Y') {
			Calci();
		} else if(ch=='N'||ch=='n') {
			System.out.println("*****ThankYou*****");
			System.exit(0);
		} else {
			System.out.println("Wrong Choice \nLet's try again");
			Continue();
		}
	}

	private static void Operation(int option) {
		
		switch(option){
			case 1:
				System.out.println("Enter first number:");
				int num1=sc.nextInt();
				System.out.println("Enter second number:");
				int num2=sc.nextInt();
				System.out.print("Result is:");
				System.out.println(num1+num2);
				break;

			case 2:
				System.out.println("Enter first number:");
				int num3=sc.nextInt();
				System.out.println("Enter second number:");
				int num4=sc.nextInt();
				System.out.print("Result is:");
				System.out.println(num3-num4);
				break;

			case 4:
				System.out.println("Enter first number:");
				int num5=sc.nextInt();
				System.out.println("Enter second number:");
				int num6=sc.nextInt();
				System.out.print("Result is:");
				System.out.println(num5/num6);
				break;

			case 3:
				System.out.println("Enter first number:");
				int num7=sc.nextInt();
				System.out.println("Enter second number:");
				int num8=sc.nextInt();
				System.out.print("Result is:");
				System.out.println(num7*num8);
				break;
				
			case 5:
				System.out.print("*****ThankYou*****");
				System.exit(0);
		}
		
		
	}
	
}