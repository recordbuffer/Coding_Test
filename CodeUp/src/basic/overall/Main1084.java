package basic.overall;

import java.util.Scanner;

public class Main1084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] data = s.split(" ");
		
		int r = Integer.valueOf(data[0]);
		int g = Integer.valueOf(data[1]);
		int b = Integer.valueOf(data[2]);
	
		int cnt = 0;
		
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<g; j++) {
				for(int k=0; k<b; k++) {
					System.out.printf("%d %d %d\n",i,j,k);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
