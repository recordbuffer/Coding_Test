package basic.overall;

import java.util.Scanner;

public class Main1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
				
		String[] data = s.split(" ");
		
		for(int i=0; i<=data.length;i++) {
			System.out.println(data[i]);

			if(data[i].equals("q")) {
				break;
			}
		}
	}

}
