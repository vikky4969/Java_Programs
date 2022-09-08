package org.arrays;

import java.util.Scanner;

public class FindPositionAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any alphabet: ");
		char input=	sc.next().charAt(0);
		input=Character.toLowerCase(input);
		int asciivalue=(int)input;
		int position=asciivalue-96;
		System.out.println(position);
	}

}
