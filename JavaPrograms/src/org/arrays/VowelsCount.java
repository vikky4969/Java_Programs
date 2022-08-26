package org.arrays;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome";
		int Vcount=0,Ccount=0;
		String s= s1.toLowerCase();
		char s2[]=s.toCharArray();
		for (char c : s2) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				Vcount++;
			}
			else {
				Ccount++;
			}
		}
		System.out.println("Vowels count: "+Vcount);
		System.out.println("Consonants count: "+Ccount);
	}

}
