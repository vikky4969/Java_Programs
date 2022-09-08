package org.prog;

import java.util.Iterator;
import java.util.Scanner;

public class PrintEvenAndOddNos {
	
	public void printoddnos() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to print odd numbers:");
		int n=sc.nextInt();
		for (int i=1; i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
	public void printevennos() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to print even numbers:");
		int n=sc.nextInt();
		for (int i=1; i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEvenAndOddNos print=new PrintEvenAndOddNos();
		print.printevennos();;
	}
}

