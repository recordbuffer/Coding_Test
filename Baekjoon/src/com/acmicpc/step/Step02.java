package com.acmicpc.step;

import java.util.Scanner;

public class Step02 {
	public static void main(String[] args) {
		//LoopIf.AandB();
		//LoopIf.grade();
		//LoopIf.year();
		//LoopIf.quadrant();
		Step02.alarm();
	}
	
	public static void AandB() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		} else if(A<B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
	public static void grade() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x<=100 && x>=90) {
			System.out.println("A");
		} else if(x<90 && x>=80) {
			System.out.println("B");
		} else if(x<80 && x>=70) {
			System.out.println("C");
		} else if(x<70 && x>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
	public static void year() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x%4==0 && x%100!=0 || x%400==0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	public static void quadrant() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println(1);
		} else if(x<0 && y>0) {
			System.out.println(2);
		} else if(x<0 && y<0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}
	public static void alarm() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M>=45) {
			M-=45;
		} else if(M<45) {
			M+=15;
			if(H<=0) {
				H+=23;
			} else {
				H-=1;
			}
		} 
		
		
		System.out.println(H+" "+M);
		
	}
}
