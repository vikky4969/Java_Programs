package org.arrays;

public class CheckEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Java";
String s2="Java";
System.out.println("1st: "+s1.equals(s2));

String s3="Java";
String s4="java";
System.out.println("2nd: "+s3.equals(s4));

String s5="Brown Technology";
String s6="BrownTechnology";
System.out.println("3rd: "+s5.equals(s6));

String s7="Java";
String s8="java";
System.out.println("4th: "+s7.equalsIgnoreCase(s8));

String s9="Nisha";
String s10="nisha";
System.out.println("5th: "+s9.equalsIgnoreCase(s10));

	}

}
