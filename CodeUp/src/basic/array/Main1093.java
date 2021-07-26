package basic.array;

import java.util.Scanner;

public class Main1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		
		int[] arr = new int[23];
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			arr[a-1] += 1;
		}
		
		for(int i=0; i<23; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
