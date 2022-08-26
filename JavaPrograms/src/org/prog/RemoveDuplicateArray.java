package org.prog;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,6,9,10,10,12,10,6};
		int out[]= {};
		int count;
		for (int i = 0; i <a.length; i++) {
			count=0;
			for (int j=i+1; j < a.length; j++) {
				if(a[j]==a[i]) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(a[i]);
			}
		}
	}

}
