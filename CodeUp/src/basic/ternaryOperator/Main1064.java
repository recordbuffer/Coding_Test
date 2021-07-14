package basic.ternaryOperator;

import java.util.Scanner;

public class Main1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] data = s.split(" ");
		
		int a = Integer.valueOf(data[0]);
		int b = Integer.valueOf(data[1]);
		int c = Integer.valueOf(data[2]);
		
		int x = (a<b?a:b)<c?(a<b?a:b):c;
		
		System.out.println(x);
		
	}

}
