package org.prog;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=11,count=0;
		for (int i=2; i<n; i++) {
			if(n%i==0) {
				count=1;
			}
		}
		if(count==0) {
			System.out.println("Prime");
		}
		else {
		System.out.println("Not Prime");
		}
	}

}
