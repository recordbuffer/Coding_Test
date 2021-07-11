package basic.comparison;

import java.util.Scanner;

public class Main1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String [] data = s.split(" ");
		
		int a = Integer.valueOf(data[0]);
		int b = Integer.valueOf(data[1]);
		
		if(a<=b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
