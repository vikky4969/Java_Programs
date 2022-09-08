package org.prog;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to count");
		int n=sc.nextInt();
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		System.out.println("Count Of given digits: "+count);
	}

}
