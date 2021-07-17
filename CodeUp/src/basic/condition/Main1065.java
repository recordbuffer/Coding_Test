package basic.condition;

import java.util.Scanner;

public class Main1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] data = s.split(" ");
		
		int a = Integer.valueOf(data[0]);
		int b = Integer.valueOf(data[1]);
		int c = Integer.valueOf(data[2]);
		
		if(a%2==0) System.out.println(a);
		if(b%2==0) System.out.println(b);
		if(c%2==0) System.out.println(c);
	}

}
