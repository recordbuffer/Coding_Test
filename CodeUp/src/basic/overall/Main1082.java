package basic.overall;

import java.util.Scanner;

public class Main1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(16);

		
		for(int i=1;i<16;i++) {
			System.out.printf("%X*%X=%X\n",c,i,c*i);
		}
		
	}
}
