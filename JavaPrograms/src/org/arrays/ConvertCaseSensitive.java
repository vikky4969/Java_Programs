package org.arrays;

import java.util.Scanner;

public class ConvertCaseSensitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to convert case sensitive:");
		String s=sc.nextLine();
		char[] chararray=s.toCharArray();
		for (int i = 0; i < chararray.length; i++) {
			if(chararray[i]>=97 && chararray[i]<=122) {
				chararray[i]=(char) (chararray[i]-32);
			}
			else if(chararray[i]>=65 && chararray[i]<=90) {
				chararray[i]=(char) (chararray[i]+32);
			}
		}
		System.out.print(chararray);
	}
}
