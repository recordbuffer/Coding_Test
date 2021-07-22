package basic.overall;

import java.util.Scanner;

public class Main1086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		
		String[] data = ss.split(" ");
		
		double w = Double.valueOf(data[0]);
		double h = Double.valueOf(data[1]);
		double b = Double.valueOf(data[2]);
		
		double result = (w*h*b)/8/(1<<10)/(1<<10);
		
		System.out.printf("%.2f MB",result);
	}

}
