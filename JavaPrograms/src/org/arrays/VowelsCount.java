package org.arrays;

import java.util.Scanner;

public class VowelsCount {
	public void vowelscount() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1=sc.nextLine();
		int Vcount=0;
		String s= s1.toLowerCase();
		char s2[]=s.toCharArray();
		for (char c : s2) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				Vcount++;
			}
		}
		System.out.println("Vowels count: "+Vcount);
	}
	public void vowelscount1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1=sc.nextLine();
		int Vcount=0;
		String s= s1.toLowerCase();
		char s2[]=s.toCharArray();
		for (char c : s2) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				Vcount++;
			}
		}
		System.out.println("Vowels count: "+Vcount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VowelsCount count=new VowelsCount();
count.vowelscount();
	}

}
