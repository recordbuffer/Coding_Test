package basic.overall;

import java.util.Scanner;

public class Main1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		
		String[] data = ss.split(" ");
		
		double h = Double.valueOf(data[0]);
		double b = Double.valueOf(data[1]);
		double c = Double.valueOf(data[2]);
		double s = Double.valueOf(data[3]);
		
		
		double result = (h*b*c*s)/8/(1<<10)/(1<<10);
		System.out.printf("%.1f MB",result);
	}

}
