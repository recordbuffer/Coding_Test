package com.acmicpc.step;

import java.util.Scanner;

public class Step01 {
	public static void main(String[] args) {
		//Step01.helloWorld();
		//Step01.kriii();
		//Step01.cat();
		//Step01.dog();
		//Step01.plus();
		//Step01.minus();
		//Step01.div();
		//Step01.operation();
		//Step01.remainder();
		Step01.mul();
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
		
		String one = sc.nextLine();
		String two = sc.nextLine();

		int t1 = Integer.parseInt(two.substring(2));
		int t10 = Integer.parseInt(two.substring(1,2));
		int t100 = Integer.parseInt(two.substring(0,1));		
		
		int o = Integer.parseInt(one);		
		
		System.out.println(o*t1);
		System.out.println(o*t10);
		System.out.println(o*t100);

		System.out.println(((o*t100)*100)+((o*t10)*10)+(o*t1));
	}
}
