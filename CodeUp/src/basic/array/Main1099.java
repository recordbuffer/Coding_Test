package basic.array;

import java.util.Scanner;

public class Main1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[20][20];
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		arr[2][2]=9;
				
	}

}
