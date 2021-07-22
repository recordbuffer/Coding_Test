package basic.overall;

import java.util.Scanner;

public class Main1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] data = s.split(" ");
		
		long a = Long.valueOf(data[0]);
		long m = Long.valueOf(data[1]);
		long d = Long.valueOf(data[2]);
		long n = Long.valueOf(data[3]);

		for(int i=1;i<n; i++) {
			a=(a*m)+d;
		}
		System.out.println(a);
		
	}

}
