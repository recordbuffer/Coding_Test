package com.step.io;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		//HelloWorld.helloWorld();
		//HelloWorld.kriii();
		//HelloWorld.cat();
		//HelloWorld.dog();
		//HelloWorld.plus();
		//HelloWorld.minus();
		//HelloWorld.div();
		//HelloWorld.operation();
		//HelloWorld.remainder();
		HelloWorld.mul();
	}
	
	public static void helloWorld() {
		System.out.println("Hello World");
	}
	public static void kriii() {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}
	public static void cat() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	public static void dog() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	public static void plus() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
	}
	public static void minus() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A-B);
	}
	public static void div() {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		System.out.println(A/B);
	}
	public static void operation() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
	public static void remainder() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
	public static void mul() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String y = sc.nextLine();
		

		
	}
}
