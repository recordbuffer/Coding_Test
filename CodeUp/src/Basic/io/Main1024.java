package Basic.io;

import java.util.Scanner;

public class Main1024 {
	public static void main(String[] args) {
		
		String s;		
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		
		for(int i=0; i<s.length(); i++) {
			System.out.println("\'"+s.charAt(i)+"\'");
			
		}
	}

}
