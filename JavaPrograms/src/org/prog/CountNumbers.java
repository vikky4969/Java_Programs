package org.prog;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=123,count=0;
while(n>0) {
	count++;
	n=n/10;
}
System.out.println("Count Of given digits: "+count);
	}

}
