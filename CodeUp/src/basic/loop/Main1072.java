package basic.loop;

import java.util.Scanner;

public class Main1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int data[] = new int[n];
		
		for(int i=0; i<n; i++) {
			data[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
	}
}
