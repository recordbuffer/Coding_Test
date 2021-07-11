package basic.logic;

import java.util.Scanner;

public class Main1058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String [] data = s.split(" ");
		
		int a = Integer.valueOf(data[0]);
		int b = Integer.valueOf(data[1]);
		
		if(a==0 && b==0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
