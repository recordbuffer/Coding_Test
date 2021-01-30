package Basic.io;

import java.util.Scanner;

public class Main1021 {
	public static void main(String[] args) {

		String s;		
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		
		String [] data = s.split(" ");
				
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
		}
	}
}
