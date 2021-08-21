package com.acmicpc.step;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Step07 {
	public static void main(String[] args) {
		//Str.asc();
		//Str.sumN();
		Step07.apb();
		//Str.loopStr();
		//Str.learning();
		//Str.cnt();
	}
	public static void asc() {
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().charAt(0);
		sc.close();
		
		int i = (int)c;
		
		System.out.println(i);
	}
	public static void sumN() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		
		int[] arr = new int[N];
		
		int sum=0;
		
		for(int i=0; i<N; i++) {
			char c = s.charAt(i);
			
			arr[i] = c - '0';
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	public static void apb() {
		
	}
	public static void loopStr() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int R = sc.nextInt();
			String s = sc.next();
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
	public static void learning() {
		
	}
	public static void cnt() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(s," ");
		
		System.out.println(st.countTokens());
	}
	public static void sangsu() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		
	}
	public static void dial() {
		
	}
	public static void croApb() {
		
	}
	public static void group() {
		
	}
}
