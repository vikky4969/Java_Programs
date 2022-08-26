package org.arrays;

import java.util.Scanner;

public class VerifyEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter your Email Id:");
String m1=scan.nextLine();
boolean mail=false;
 if(m1.contains("@")) {
	mail=true;
}
System.out.println(mail);

System.out.println("Enter your Email Id:");
String m2=scan.nextLine();
 if(m2.contains("gmail")) {
	 String replace4=m2.replace("gmail", "yahoo");
	 System.out.println("s4: "+replace4);
}

/*System.out.println("Enter your phone.no.:");
String m2=scan.nextLine();
boolean phone=false;
if(m2.contains("0123456789")) {
	phone=true;
}
System.out.println(phone);
	}*/
	}
}
