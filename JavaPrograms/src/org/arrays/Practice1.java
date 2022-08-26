package org.arrays;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="WelcomE";
for (int i = 0; i < s1.length(); i++) {
	char c=s1.charAt(i);
	if(c>='A'&&c<='Z') {
		char s2=Character.toLowerCase(c);
		System.out.print(s2);
	}
	else {
		char s2=Character.toUpperCase(c);
		System.out.print(s2);
	}
}

	}

}
