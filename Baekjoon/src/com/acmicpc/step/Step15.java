package com.acmicpc.step;

import java.util.Scanner;

public class Step15 {
	public static void main(String[] args) {
		// Step15.q1003();
		//Step15.q9184();
		//Step15.q1904();
		//Step15.q9461();
		//Step15.q1149();
		//Step15.q1932();

	}

	// 1003 피보나치 함수
	static Integer[][] dp = new Integer[41][2];
	/*
	 * Integer vs int Integer는 wrapper class 기본 데이터 타입을 값이 아닌 객체로 사용
	 */

	public static void q1003() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 수행할 케이스 횟수 T

		// N=0 일때
		dp[0][0] = 1; // F(0) = 1;
		dp[0][1] = 0; // F(1) = 0;
		// N=1일때
		dp[1][0] = 0; // F(0) = 0;
		dp[1][1] = 1; // F(1) = 1;

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 입력받은 N

			fibo(N);
			System.out.println(dp[N][0] + " " + dp[N][1]);
		}
		sc.close();
	}

	static Integer[] fibo(int N) {
		if (dp[N][0] == null || dp[N][1] == null) {
			dp[N][0] = fibo(N - 1)[0] + fibo(N - 2)[0];
			dp[N][1] = fibo(N - 1)[1] + fibo(N - 2)[1];
		}
		return dp[N];
	}

	// 9184 신나는 함수 실행
	static int[][][] dp2 = new int[21][21][21];

	public static void q9184() {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;

		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			if (a == -1 && b == -1 && c == -1)
				break;

			System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
		}
		sc.close();
	}

	static int w(int a, int b, int c) {
		if (dp2[a][b][c] == 0) {

			if (a <= 0 || b <= 0 || c <= 0) return 1;
			if (a > 20 || b > 20 || c > 20) return dp2[20][20][20] = w(20, 20, 20);

			if (a < b && b < c) return dp2[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);

			else return dp2[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
		}
		return dp2[a][b][c];
	}
	
	//1904 01타일
	static int dp3[] = new int[1000001];
	
	public static void q1904() {
		// N:1 => 1 => 1
		// N:2 => 11, 00 => 2
		// N:3 => 111, 100, 001 => 3
		// N:4 => 1111, 1100, 0011, 1001 => 5
		// N:5 => 11111, 10000, 11100, 00111, 10011, 11001, 00100 => 8	
		Scanner s= new Scanner(System.in);
		int N = s.nextInt();
		
	}
	
	//9461 파도반 수열
	public static void q9461() {
		//f(n) = f(n-2) + f(n-3)
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
		}
	}
	
	//1149 RGB거리
	public static void q1149() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	}
	
	//1932 정수 삼각형
	public static void q1932() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		
	
	}
	
	
}
