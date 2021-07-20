package basic.loop;

import java.util.Scanner;

public class Main1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(true) {
			if(n==0) {
				break;	
			} 
			System.out.println(n);
			n-=1;
		}
	}

}
