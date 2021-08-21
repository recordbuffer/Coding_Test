package com.acmicpc.step;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Step05 {
	public static void main(String[] args) {
		//Array.minmax();
		//Array.max();
		//Array.count();
		//Array.remain();
		//Array.avr();
		//Array.ox();
		Step05.realAvr();
	}
	public static void minmax() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int min = arr[0];
		int max = arr[N-1];
		
		for(int i=0; i<arr.length; i++ ) {
			if(arr[i]<=min) min = arr[i];
			
			if(arr[i]>=max) max = arr[i];
		}
		
		System.out.println(min+" "+max);
	}
	public static void max() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i]=sc.nextInt();
		}
	
		int max = arr[0];
		int index = 0;
		
		for(int i=0; i<9; i++) {
			if(arr[i]>=max) {
				max = arr[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
	public static void count() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		int ABC = A*B*C;
		String sABC = Integer.toString(ABC);

		//���� ���� ����		
		for(int i=0; i<=9; i++) {
			int cnt = 0;
			for(int j=0; j<sABC.length(); j++) {
				if(sABC.charAt(j)-'0'==i) cnt++;
			}
			System.out.println(cnt);
		}

	}
	public static void remain() {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> s = new HashSet<Integer>();
		
		//�迭 ������ ����
		for(int i=0; i<10; i++ ) {
			int n = sc.nextInt();
			
			s.add(n%42);		
		}
		
		sc.close();
		
		System.out.println(s.size());
		
	}
	public static void avr() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//���� �Է¹ޱ�, �ִ� ���ϱ�
		double[] arr = new double[N];
		
		double M = arr[0];
		
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
			
			if(arr[i]>=M) M=arr[i];
		}
		sc.close();
		
		//���� ���� + ���ο� ���
		double sum=0;
		
		for(int i=0; i<N; i++) {
			arr[i]=arr[i]/M*100;
			
			sum+=arr[i];
		}
		
		System.out.println(sum/N);
	}
	public static void ox() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[] arr = new String[N];
		
		//�迭�� ����
		for(int i=0; i<N; i++) {
			arr[i]=sc.next();
		}
		sc.close();
		
		//�ϳ��� OX���� �˻�
		//�迭 �� ������ŭ �ݺ�
		for(int i=0; i<N; i++) {
			int cnt=0;
			int sum=0;
			
			//�迭 �� ���� ���� ��ŭ �˻�
			for(int j=0; j<arr[i].length(); j++) {
				//OX ����
				if(arr[i].charAt(j)=='O') {
					cnt++;
				} else {
					cnt=0;
				}
				sum+=cnt;
			}
			System.out.println(sum);
		}
	}
	public static void realAvr() {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
								
		for(int i=0; i<C; i++) {
			double sum = 0;
			
			int N = sc.nextInt();
			
			//�Է� �� ��� �迭 ����
			int[] arr = new int[N];
			
			for(int j=0; j<N; j++) {
				arr[j]=sc.nextInt();
			
				sum+=arr[j];
			}
			
			double avg = (sum/N);
			double cnt = 0;
			
			//��� �Ѵ� ���� ��� 
			for(int k=0; k<N; k++) {
				if(arr[k]>avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",(cnt/N)*100);
		}
	}
}
