package org.prog;

public class CountOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i=1; i<=10;i++) {
			if(i%2==0) {
						count++;
					}
			}
		System.out.println("Count of even numbers: "+count);
	}

}
