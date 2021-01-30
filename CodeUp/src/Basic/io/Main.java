package Basic.io;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		float x;
		Scanner sc = new Scanner(System.in);
		x=sc.nextFloat();
		
		String s;
		s=String.valueOf(x);

		String [] sr = s.split(".");
				
		for(int i=0; i<sr.length; i++) {
			System.out.println(sr[i]);
		}
	}

}
