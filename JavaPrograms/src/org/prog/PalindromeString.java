package org.prog;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String n= "mom";
int i=0;
int j=n.length()-1;
boolean palindrome=true;
while(i<j) {
	if(n.charAt(i)!=n.charAt(j)) {
		palindrome=false;
		break;
	}
	i++;
	j--;
}
if(palindrome) {
	System.out.println("It is a Palindrome");
}
else {
	System.out.println("It is not a Palindrome");
}

	}

}
