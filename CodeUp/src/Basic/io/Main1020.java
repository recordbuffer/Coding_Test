package Basic.io;

import java.util.Scanner;

public class Main1020 {
	public static void main(String[] args) {

		String x;
		String[] code;
		Scanner sc = new Scanner(System.in);
		x=sc.nextLine();
		code=x.split("\\-");
				
		String a1 = String.valueOf(code[0]);
		String a2 = String.valueOf(code[1]);
		
		System.out.print(a1+a2);
	}

}
