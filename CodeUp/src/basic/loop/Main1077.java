package basic.loop;

import java.util.Scanner;

public class Main1077 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;

		while(true) {
			if(a>n) {
				break;	
			} 
			System.out.println(a);
			a+=1;
		}
	}

}
