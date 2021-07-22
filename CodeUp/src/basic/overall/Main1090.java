package basic.overall;

import java.util.Scanner;

public class Main1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] data = s.split(" ");
		
		long a = Long.valueOf(data[0]);
		long r = Long.valueOf(data[1]);
		long n = Long.valueOf(data[2]);

		for(int i=1;i<n; i++) {
			a*=r;
		}
		System.out.println(a);
		
	}

}
