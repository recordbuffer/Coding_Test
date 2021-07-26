package basic.array;

import java.util.Scanner;

public class Main1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int x = 23;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();			
			arr[i] = a;
			
			if(x>a) {
				x=a;
			}
		}
		System.out.println(x);
	}

}
