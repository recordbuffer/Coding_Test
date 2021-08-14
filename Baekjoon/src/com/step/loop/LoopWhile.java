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
		String N = sc.nextLine();

		int a = Integer.parseInt(N.substring(0, 1));
		int b = Integer.parseInt(N.substring(1));

		int cnt = 0;

		while (true) {

			int x = a;
			int y = b;
			int z = x + y;

			if (z > 10) {
				z = z - 10;
			}

			x = y;
			y = z;

			if(x==a && y==b) break;

			cnt++;
		}

		System.out.println(cnt);
	}
}
