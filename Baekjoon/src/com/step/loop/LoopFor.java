package com.step.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LoopFor {
	public static void main(String[] args) throws IOException {
		//LoopFor.gugudan();
		//LoopFor.sum();
		//LoopFor.bfAB();
		//LoopFor.forN();
		//LoopFor.Nfor();
		//LoopFor.caseX();
		//LoopFor.caseABC();
		//LoopFor.star();
		LoopFor.revStar();
		//LoopFor.nx();
	}

	public static void gugudan() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
	public static void AandB() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			arr[i]=A+B;
			
		}
		
		for(int i=0; i<num; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void sum() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void bfAB() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
	
		int t = Integer.parseInt(br.readLine());
	
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken()))+"\n");
		}
		bw.flush();
	}
	public static void forN() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println(i);
		}
	}
	public static void Nfor() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			System.out.println(i);
		}
	}
	public static void caseX() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=1; i<=t; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("Case #"+i+": "+(A+B));
		}
	}
	public static void caseABC() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=1; i<=t; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
		}
	}
	public static void star() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void revStar() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==i) {
					for(int k=1; k<n-i; k++) {
						System.out.print(" ");
					}
					for(int l=1; l<=j+1; l++) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	
	}
	public static void nx() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int nn = sc.nextInt();
			
			if(nn<x) System.out.print(nn+" ");
		}
	}
}