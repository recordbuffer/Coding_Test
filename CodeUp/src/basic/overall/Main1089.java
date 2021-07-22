package basic.overall;

import java.util.Scanner;

public class Main1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] data = s.split(" ");
		
		int a = Integer.valueOf(data[0]);
		int d = Integer.valueOf(data[1]);
		int n = Integer.valueOf(data[2]);

		for(int i=1;i<n; i++) {
			a+=d;
		}
		System.out.println(a);
		
	}

}
