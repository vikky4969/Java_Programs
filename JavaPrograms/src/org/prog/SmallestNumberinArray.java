package org.prog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberinArray {
Integer[] array= {2,5,6,4,8};
public void findSmallest() {
	int smallest=Integer.MAX_VALUE;
	for (int i = 0; i < array.length; i++) {
		if(array[i]<smallest) {
			smallest=array[i];
		}
	}
	System.out.println(smallest);
}
public void usingArray() {
	Arrays.sort(array);
	System.out.println(array[0]);
}
public void usingCollections() {
	List<Integer> list=Arrays.asList(array);
	Collections.sort(list);
	System.out.println(list.get(0));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmallestNumberinArray sm=new SmallestNumberinArray();
sm.usingCollections();
	}

}
