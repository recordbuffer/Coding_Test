package basic.decimal;

import java.util.Scanner;

public class Main1034 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		
		int o = Integer.valueOf(i,8);
		
		System.out.printf("%d",o);
	}

}
