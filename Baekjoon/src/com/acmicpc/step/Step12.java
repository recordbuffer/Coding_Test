package com.acmicpc.step;

import java.util.Arrays;
import java.util.Scanner;

public class Step12 {
	public static void main(String[] args) {
		//Step12.q2750();
		Step12.q2751();
	}
	public static void q2750() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void q2751() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
	}

}
