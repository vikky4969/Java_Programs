package org.arrays;

import java.util.Scanner;

public class ExtractNoFromStringAdd {
	public void extractNoAndAdd() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any String: ");
		String s=sc.nextLine();
		try {
			String s1=s.toLowerCase();
			int total=0;
			for (int i = 0; i < s1.length(); i++) {
				char character=	s1.charAt(i);
				if(Character.isDigit(character)) {
					total=total+Character.getNumericValue(character);
				}
			}
			System.out.println(total);
		} finally {
			sc.close();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExtractNoFromStringAdd extract=new ExtractNoFromStringAdd();
extract.extractNoAndAdd();
	}

}
