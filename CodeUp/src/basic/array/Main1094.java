package basic.array;

import java.util.Scanner;

public class Main1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		for(int i=n-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
