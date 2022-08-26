package org.prog;

public class FloydTriangle {
public void floydtriangle() {
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println("\n");
	}
}
public void Iteratetriangle() {
	int startingnumber=1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(startingnumber+" ");
			startingnumber=	startingnumber+1;
		}
	
		System.out.println("\n");
	}
}
public void Reversefloydtriangle() {
	for(int i=7;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println("\n");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FloydTriangle fl=new FloydTriangle();
fl.Iteratetriangle();
	}
}
