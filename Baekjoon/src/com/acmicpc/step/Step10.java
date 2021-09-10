package com.acmicpc.step;

import java.util.Scanner;

//��� 
public class Step10 {
	public static void main(String[] args) {
		//Step10.q10872();
		Step10.q10870();
	}
	
	public static void q10872() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int sum = facto(N);
		System.out.println(sum);
	}
	public static int facto(int N) {
		if(N>0) {
			return N*facto(N-1);
		} else {
			return 1;
		}
	}
	
	public static void q10870() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int fb = fibo(N);
		System.out.println(fb);
	}
	public static int fibo(int N) {
		//피보나치 함수
		if(N==0) return 0;		//N이 0일때 : 0
		if(N==1) return 1;		//N이 1일때 : 1
		
		return fibo(N-1) + fibo(N-2);
	}
	
	
}

