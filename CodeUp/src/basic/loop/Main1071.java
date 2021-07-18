package basic.loop;

import java.util.Scanner;

public class Main1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n==0) {
				break;	
			} 
			System.out.println(n);
		}
	}

}
