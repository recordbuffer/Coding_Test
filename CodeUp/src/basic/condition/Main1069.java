package basic.condition;

import java.util.Scanner;

public class Main1069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		switch(n){
		case "A" : 
			System.out.println("best!!!");
			break;
		case "B" :
			System.out.println("good!!");
			break;
		case "C" :
			System.out.println("run!");
			break;
		case "D" :
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
		}
	}
}
