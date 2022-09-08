package org.prog;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n number of values to print prime numbers:");
		int n=sc.nextInt();
		for (int i=2; i <=n; i++) {
			int count=0;
			for (int j=2; j<i; j++) {
				if(i%j==0) {
					count=1;
					break;
					}
			}
			if(count==0) {
				System.out.print(i+" ");
			}
		}
	}
}
