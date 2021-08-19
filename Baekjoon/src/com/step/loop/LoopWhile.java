package com.step.loop;

import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		// LoopWhile.AandB();
		// LoopWhile.AandB2();
		LoopWhile.cycle();
	}

	public static void AandB() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A == 0 && B == 0)
				break;

			System.out.println(A + B);
		}
	}

	public static void AandB2() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(A + B);
		}
		sc.close();
	}

	public static void cycle() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt = 0;
		
		int x = N;	//사이클 후 숫자
	
		while(true) {
			
			x = (((x%10)*10)+((x/10)+(x%10))%10);
			cnt++;
			
			if(N==x) break;
		}
		
		System.out.println(cnt);
	}
}
