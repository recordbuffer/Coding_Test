package com.acmicpc.step;

import java.util.Scanner;

public class Step08 {
	public static void main(String[] args) {
		Step08.q1712();
	}
	public static void q1712() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();	//고정비용
		int B = sc.nextInt();	//1대당... 가변비용
		int C = sc.nextInt();	//1대당 가격
		
		int cnt=1;
		
		do {
			C=C*cnt;
			int sum=A+(B*cnt);
			
			System.out.println(C);
			System.out.println(B);
			cnt++;	
			
		} while(C>A+B);
		
		System.out.println(cnt);
		
	}
}
