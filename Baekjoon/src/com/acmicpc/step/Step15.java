package com.acmicpc.step;

import java.util.Scanner;

public class Step15 {
	public static void main(String[] args) {
		//Step15.q1003();
		Step15.q9184();
	}	
	
	static Integer[][] dp = new Integer[41][2];
	/*
	 * Integer vs int
	 * Integer는 wrapper class
	 * 기본 데이터 타입을 값이 아닌 객체로 사용
	 */
	
	public static void q1003() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// 수행할 케이스 횟수 T
		
		//N=0 일때
		dp[0][0] = 1;		// F(0) = 1;
		dp[0][1] = 0;		// F(1) = 0;
		//N=1일때
		dp[1][0] = 0;		// F(0) = 0;
		dp[1][1] = 1;		// F(1) = 1;				
		
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();	// 입력받은 N
			
			fibo(N);
			System.out.println(dp[N][0] + " " + dp[N][1]);
		}
		sc.close();
	}
		
	static Integer[] fibo(int N) {
		if(dp[N][0]==null || dp[N][1]==null) {
			dp[N][0] = fibo(N-1)[0] + fibo(N-2)[0];
			dp[N][1] = fibo(N-1)[1] + fibo(N-2)[1];
		}
		return dp[N];
	}

	public static void q9184() {
		Scanner sc = new Scanner(System.in);
	}
}
