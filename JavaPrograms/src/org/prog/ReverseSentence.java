package org.prog;

import java.util.Scanner;

public class ReverseSentence {
public static void reverseSentence() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter some sentence");
	String input=sc.nextLine();
	String rev="";
	String[] s1=input.split(" ");
for (int i =s1.length-1; i>=0; i--) {
	rev += s1[i]+" ";
}
System.out.println("Reversed: "+rev);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ReverseSentence reverse=new ReverseSentence();
//		reverse.reverseSentence();
		reverseSentence();
	}

}
