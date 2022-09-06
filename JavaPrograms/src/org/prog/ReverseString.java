package org.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
	String s="Vignesh";
	String rev="";
	public void reverseString() {
		char[]  a=s.toCharArray();
		for (int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
	}
	public void usingStringBuffer() {
		StringBuffer reverse=new StringBuffer();
		reverse.append(s);
		System.out.println(reverse.reverse());
	}
	public void usingCollections() {
		String s1="Kumar";
		char[] s2=s1.toCharArray();
//		List<Character> list =new ArrayList<Character>();
//		for (Character li : s2) {
//			list.add(li);
//		}
		List<char[]> list=Arrays.asList(s2);
		Collections.reverse(list);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReverseString rev=new ReverseString();
rev.usingStringBuffer();


	}
}
