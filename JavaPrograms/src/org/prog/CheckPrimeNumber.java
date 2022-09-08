package org.prog;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check prime or not:");
		int n=sc.nextInt();
		boolean prime=true;
		for (int i=2; i<n; i++) {
			if(n%i==0) {		
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println(n+" is Prime");
		}
		else {
			System.out.println(n+" is not Prime");
		}
	}
}
