package org.prog;

public class ReverseWordsSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="I Like Vignesh kumar";
String[] split=s.split(" ");
String reverse="";
for (int i =split.length-1; i>=0; i--) {
	reverse=reverse+split[i]+" ";
}
System.out.println(reverse);
	}

}
