package org.prog;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int a=sc.nextInt();
		int n=a;
		int i=0,j=0;
		while(n>0) {
			i=n%10;
			j=j+(i*i*i);
			n=n/10;
		}
		if(a==j) {
			System.out.println(a+" is an \"Armstrong\" Number");
		}
		else {
			System.out.println(a+" is not an \"Armstrong\" Number");
		}
	}

}
