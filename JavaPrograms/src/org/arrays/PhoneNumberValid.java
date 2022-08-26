package org.arrays;

import java.util.Scanner;

public class PhoneNumberValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s2="Nisha";
		String s3="nisha";
		System.out.println(s2.compareTo(s3));
		
		String s4="Nia";
		String s5="nisha";
		System.out.println(s4.compareTo(s5));

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Valid PhoneNumber"); 
		String s1=scan.nextLine();
		if(s1.length()>10) { 
			System.out.println("Invalid Phonenumber");
		} else {
			System.out.println("Valid Phonenumber");
		}
	}

}
