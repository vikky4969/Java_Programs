package org.arrays;

import java.util.Scanner;

public class ValidPhNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Valid PhoneNumber"); 
		String s1=scan.nextLine();
		boolean phone=true;
		char s[]=s1.toCharArray();
		for (char c : s) {
			if(!Character.isDigit(c)) {
				phone=false;
				break;
				}
		}
		System.out.println(phone);
	}

}
