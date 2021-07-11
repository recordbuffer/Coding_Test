package basic.decimal;

import java.util.Scanner;

public class Main1035 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		
		int o = Integer.valueOf(i,16);
		
		System.out.printf("%o",o);
	}

}
