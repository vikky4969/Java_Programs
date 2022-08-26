package org.arrays;

public class SumofArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8,9,10};
int sum=0;
for (int i : a) {
	sum=sum+i;
}
System.out.println("Sum of array: "+sum);
System.out.println("Average: "+(sum/10));
	}

}
