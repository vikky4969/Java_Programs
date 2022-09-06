package org.prog;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153,i=0,j=0;
		int n=a;
		while(n>0) {
			i=n%10;
			j=j+(i*i*i);
			n=n/10;
		}
		if(a==j) {
			System.out.println(a+" is a \"Armstrong\" Number");
		}
		else {
			System.out.println(a+" is not a \"Armstrong\" Number");
		}
	}

}
