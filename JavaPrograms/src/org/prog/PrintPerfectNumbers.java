package org.prog;

import java.util.Scanner;

public class PrintPerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number limit to print perfect numbers");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			int sum=0;
			for (int j = 1; j<i; j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(sum==i) {
				System.out.print(i+" ");
			}
		}
	}
}
