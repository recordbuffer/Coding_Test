package com.step.io.fun;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		//Array.minmax();
		//Array.max();
		Array.count();
	}
	public static void minmax() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//min 	
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++ ) {
			if(arr[i]<min) min = arr[i];
		}
		
		//max
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) max = arr[i];
		}
		System.out.println(min+" "+max);
	}
	public static void max() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i]=sc.nextInt();
		}
	
		int max = arr[0];
		int index = 0;
		
		for(int i=0; i<9; i++) {
			if(arr[i]>=max) {
				max = arr[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
	public static void count() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int ABC = A*B*C;
		
		int[] cnt = new int[10];
		

	}
}
