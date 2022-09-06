package org.prog;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String org= scan.nextLine();
		String n= org;
		String n1= n.toLowerCase();
		int i=0;
		int j=n1.length()-1;
		boolean palindrome=true;
		while(i<j) {
			if(n1.charAt(i)!=n1.charAt(j)) {
				palindrome=false;
				break;
			}
			i++;
			j--;
		}
		if(palindrome) {
			System.out.println(n+" is a Palindrome");
		}
		else {
			System.out.println(n+" is not a Palindrome");
		}

	}

}
