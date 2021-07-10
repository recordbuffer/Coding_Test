package Basic.bitshiftOperation;

import java.util.Scanner;

public class Main1048 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String [] data = s.split(" ");
		
		int a = Integer.valueOf(data[0]);
		int b = Integer.valueOf(data[1]);		
		
		System.out.printf("%d",a<<b);
		
	}

}
