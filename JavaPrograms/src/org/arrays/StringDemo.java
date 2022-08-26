package org.arrays;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Welcome to class java";
String replace=s1.replace("java", "sql");
System.out.println("s1: "+replace);

String s="Welcome";
String replace1=s.replace("e", "@");
System.out.println(replace1);

String s2="Besant Adayar";
String replace2=s2.replace("Adayar", "Omr");
System.out.println("s2: "+replace2);

String s3="Welcome to class java";
String replace3=s3.replace(" ", "#");
System.out.println("s3: "+replace3);

String s4="NISHANTHI";
String replace4=s4.toLowerCase();
System.out.println("s4: "+replace4);

String s5="nishanthi";
String replace5=s5.toUpperCase();
System.out.println("s5: "+replace5);

String s6="Welcome to class java";
boolean replace6=s6.startsWith("Welcome");
System.out.println("s6: "+replace6);

String s7="Hai i am nisha";
boolean replace7=s7.startsWith("Welcome");
System.out.println("s7: "+replace7);

String s8="Welcome to java class";
boolean replace8=s8.endsWith("class");
System.out.println("s8: "+replace8);

String s9="Welcome to java class";
boolean replace9=s9.endsWith("java");
System.out.println("s9: "+replace9);

String m1="Welcome to java class";
boolean rep1=m1.isEmpty();
System.out.println("m1: "+rep1);

String m2="";
boolean rep2=m2.isEmpty();
System.out.println("m2: "+rep2);
	}

}
