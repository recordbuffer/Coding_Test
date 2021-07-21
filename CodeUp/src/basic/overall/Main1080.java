package basic.overall;

import java.util.Scanner;

public class Main1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		for(i=1; i<1000; i++) {
			sum+=i;
			
			if(sum>=n) {
				break;
			}
		}
		System.out.println(i);
	}

}
