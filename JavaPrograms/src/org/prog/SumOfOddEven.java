package org.prog;

import java.util.Scanner;

public class SumOfOddEven {
	public void sumOfOdd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to add");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1; i<=n;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of odd numbers: "+sum);
	}
	public void sumOfeven() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to add");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1; i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of even numbers: "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfOddEven sum=new SumOfOddEven();
		sum.sumOfeven();
	}
}