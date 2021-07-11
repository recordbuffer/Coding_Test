package basic.io;

import java.util.Scanner;

public class Main1023 {
	public static void main(String[] args) {
		
		Double x;
		Scanner sc = new Scanner(System.in);
		x=sc.nextDouble();
		
		String s;
		s=String.valueOf(x);
		
		String [] sr = s.split("\\.");
		
		System.out.println(sr[0]+'\n'+sr[1]);
	}

}
