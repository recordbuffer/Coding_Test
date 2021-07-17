package basic.condition;

import java.util.Scanner;

public class Main1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if(n<0) {
			if(n%2==0) {
				System.out.println("minus");
				System.out.println("even");
			} else {
				System.out.println("minus");
				System.out.println("odd");
			}
		} else {
			if(n%2==0) {
				System.out.println("plus");
				System.out.println("even");
			} else {
				System.out.println("plus");
				System.out.println("odd");
			}
		}
	}
}
