package org.arrays;

public class StringCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int caps=0,small=0,special=0,num=0;
		String s1="Welcome To Java class @123";
		char s2[]=s1.toCharArray();
		for (char c : s2) {
			if(c>='A'&&c<='Z') {
				caps++;
			}
			else if(c>='a'&&c<='z'){
				small++;
			}
			else if(Character.isDigit(c)){
				num++;
			}
			else {
				special++;
			}
		}
		System.out.println("Caps count: "+caps);
		System.out.println("Small count: "+small);
		System.out.println("Number count: "+num);
		System.out.println("Special Char count: "+special);
	}

}
