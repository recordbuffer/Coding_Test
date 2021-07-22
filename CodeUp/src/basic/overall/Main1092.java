package basic.overall;

import java.util.Scanner;

public class Main1092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] data = s.split(" ");
		
		int a = Integer.valueOf(data[0]);
		int b = Integer.valueOf(data[1]);
		int c = Integer.valueOf(data[2]);

		int day = 1; 
		
		while(day%a!=0 || day%b!=0 || day%c!=0) {
			day++;
		}
		System.out.println(day);
	}

}
