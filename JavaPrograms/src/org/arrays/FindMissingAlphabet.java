package org.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abc";
s=s.toLowerCase();
s=s.replaceAll(" ", "");
String[] s1=s.split("");
String[] alphabets="abcdefghijklmnopqrstuvwxyz".split("");
HashSet<String> set=new HashSet<String>(Arrays.asList(s1));
HashSet<String> set1=new HashSet<String>(Arrays.asList(alphabets));
set1.removeAll(set);
System.out.println(set1);
	}

}
