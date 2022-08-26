package org.arrays;

import java.util.Scanner;

public class VerifyAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Address:");
		String m1=scan.nextLine();
		 if(m1.contains("123456789")) {
			System.out.println("Pincode is Present");
		}
		 else {
			 System.out.println("Pincode is not Present");
		 }
			}
	}


