package basic.operation;

import java.util.Scanner;

public class Main1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String [] data = s.split(" ");
		
		int a = Integer.valueOf(data[0]);
		int b = Integer.valueOf(data[1]);
		int c = Integer.valueOf(data[2]);
		
		int sum = a+b+c;
		float avg = (float)sum/3;
		
		System.out.println(sum);
		System.out.println(Math.round(avg*10)/10.0);
	}

}
