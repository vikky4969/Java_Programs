package org.arrays;

public class StringCaseCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="WelComeToJava";
		int Ucount=0,Lcount=0;
		for (int i = 0; i < s1.length(); i++) {
			char c=s1.charAt(i);
			if(c>='A'&&c<='Z') {
				Ucount++;
			}
			else {
				Lcount++;
			}
		}
		System.out.println("Uppercase: "+Ucount);
		System.out.println("Lowercase: "+Lcount);
	}
}
