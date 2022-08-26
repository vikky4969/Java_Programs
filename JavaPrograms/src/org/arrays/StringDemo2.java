package org.arrays;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//literals	
		String s1="Nisha";
		String s2="Nisha";
		System.out.println("s1: "+System.identityHashCode(s1));
		System.out.println("s2: "+System.identityHashCode(s2));
		
		// Non literals	
		String s3=new String("Nisha");
		String s4=new String("Nisha");
		System.out.println("s3: "+System.identityHashCode(s3));
		System.out.println("s4: "+System.identityHashCode(s4));
		
		//literals	
		String s5="Nisha";
		String s6="Rengan";
		String s7="NishaRengan";
		System.out.println("s5: "+System.identityHashCode(s5));
		System.out.println("s6: "+System.identityHashCode(s6));
		System.out.println("s7: "+System.identityHashCode(s7));
		
		// Non literals
		String s8=new String("Nisha");
		String s9=new String("Rengan");
		String s10=new String("NishaRengan");
		System.out.println("s8: "+System.identityHashCode(s8));
		System.out.println("s9: "+System.identityHashCode(s9));
		System.out.println("s10: "+System.identityHashCode(s10));
		
	}

}
