package basic.overall;

import java.util.Scanner;

public class Main1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String data[] = s.split(" ");

		int n = Integer.valueOf(data[0]);
		int m = Integer.valueOf(data[1]);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println(i + " " + j);
			}
		}
	}

}
