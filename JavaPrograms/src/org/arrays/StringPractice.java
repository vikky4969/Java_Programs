package org.arrays;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="BesantTechnology";
int sLength=s.length();
int sindex=s.lastIndexOf('o');
char sChar=s.charAt(9);
System.out.println("Length of S: "+sLength);
System.out.println("Last index of O: "+sindex);
System.out.println("Char(9): "+sChar);

System.out.println("\n");

String s1="SeleniumAutomationTool";
int s1Length=s1.length();
int s1index=s1.indexOf('o');
char s1Char=s1.charAt(16);
System.out.println("Length of S1: "+s1Length);
System.out.println("Char index of O: "+s1index);
System.out.println("Char(16): "+s1Char);

System.out.println("\n");

String s2="Thillaiarasu";
int s2Length=s2.length();
int s2index=s2.indexOf('n');
char s2Char=s2.charAt(11);
System.out.println("Length of S2: "+s2Length);
System.out.println("Char index of n: "+s2index);
System.out.println("Char(11): "+s2Char);

System.out.println("\n");

String s3="j a v a p r o g r a m";
int s3Length=s3.length();
int s3index=s3.lastIndexOf(' ');
char s3Char=s3.charAt(8);
System.out.println("Length of S3: "+s3Length);
System.out.println("Last index of empty space: "+s3index);
System.out.println("Char(8): "+s3Char);

System.out.println("\n");

String s4="9095484678";
int s4Length=s4.length();
int s4index=s4.indexOf('8');
char s4Char=s4.charAt(8);
System.out.println("Length of S4: "+s4Length);
System.out.println("index of 8: "+s4index);
System.out.println("Char(8): "+s4Char);
	}

}
