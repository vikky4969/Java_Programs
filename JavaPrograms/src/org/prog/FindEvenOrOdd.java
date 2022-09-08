package org.prog;

import java.util.Scanner;

public class FindEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find:");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
	}

}
