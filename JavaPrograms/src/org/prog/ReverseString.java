package org.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseString {

	public void reverseString() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any String:");
		String s=sc.nextLine();
		String rev="";
		char[]  a=s.toCharArray();
		for (int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
	}
	public void usingStringBuffer() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any String:");
		String s=sc.nextLine();
		StringBuffer reverse=new StringBuffer();
		reverse.append(s);
		System.out.println(reverse.reverse());
	}
	public void usingCollections() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any String:");
		String s=sc.nextLine();
		char[] s1=s.toCharArray();
		List<Character> list =new ArrayList<Character>();
		for (Character li : s1) {
			list.add(li);
		}
		Collections.reverse(list);
		ListIterator<Character> list1=	list.listIterator();
		while(list1.hasNext()) {
			System.out.print(list1.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReverseString rev=new ReverseString();
rev.reverseString();


	}
}
