package org.prog;

import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check perfect or not:");
		int n=sc.nextInt();
		int sum=0;
		for (int i = 1; i<=n/2; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+" is perfect number");
		}
		else
			System.out.println(n+" is not perfect number");
	}
}
