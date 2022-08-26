package org.arrays;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Welcome to java class ";
String s3=s1.substring(0, 7);
System.out.println(s3);

String s2[]=s1.split("l");
for (String x : s2) {
	System.out.println(x);
}
String s=s1.trim();
System.out.println(s);
	}

}
