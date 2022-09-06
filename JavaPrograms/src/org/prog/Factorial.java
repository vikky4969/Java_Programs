package org.prog;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int input=sc.nextInt();
for (int i=2; i <=input; i++) {
	fact=fact*i;
}
System.out.println(fact);
	}

}
