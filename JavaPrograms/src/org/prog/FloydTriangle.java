package org.prog;

public class FloydTriangle {
public void triangle() {
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
public void Iteratetriangle() {
	int startingnumber=1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(startingnumber+" ");
			startingnumber=	startingnumber+1;
		}
	
		System.out.println();
	}
}
public void Reversetriangle() {
	for(int i=1;i<=7;i++) {
		for(int j=i;j<=7;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FloydTriangle fl=new FloydTriangle();
fl.triangle();
	}
}
