package basic.condition;

import java.util.Scanner;

public class Main1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=90 && n<=100) {
			System.out.println("A");
		} else if(n>=70 && n<=89) {
			System.out.println("B");
		} else if(n>=40 && n<=69) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}

}
