package Basic.operation;

import java.util.Scanner;

public class Main1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);		
		
		int a = Integer.valueOf(s);
		a += 1;
		
		char c = (char)a;
		
		System.out.println(c);
	}

}
