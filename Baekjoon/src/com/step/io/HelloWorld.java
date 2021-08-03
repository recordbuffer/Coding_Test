package com.step.io;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		//HelloWorld.helloWorld();
		//HelloWorld.kriii();
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

	}
}
