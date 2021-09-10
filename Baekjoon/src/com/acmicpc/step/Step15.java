package com.acmicpc.step;

import java.util.Scanner;

public class Step15 {
	public static void main(String[] args) {
		Step15.q1003();
	}	
	public static void q1003() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// 수행할 케이스 횟수 T
		
		for(int i=1; i<=T; i++) {
			int N = sc.nextInt();	// 입력받은 N
			
			int fb = fibo(N);
			System.out.println(fb);
		}
	}
		
	public static int fibo(int N) {
		return 0;
	}

}
