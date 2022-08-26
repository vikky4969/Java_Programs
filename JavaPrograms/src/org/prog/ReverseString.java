package org.prog;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReverseString rev=new ReverseString();
rev.usingStringBuffer();


	}
}
