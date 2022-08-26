package org.prog;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int org= scan.nextInt();
		int rev=0;
		int n=org;
		while(n>0) {
			rev=(rev*10)+n%10;
			n=n/10;
		}
		if(org==rev) 
			System.out.println(org+" is a Palindrome");

		else 
			System.out.println(org+" is not a Palindrome");

	}
}
