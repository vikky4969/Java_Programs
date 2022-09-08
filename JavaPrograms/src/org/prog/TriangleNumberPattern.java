package org.prog;

public class TriangleNumberPattern {
	

	public void Floydtriangle() {
		int p=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(p+++" ");
			}
			System.out.println();
		}
	}
	public void pyramid() {
		int n=9;	
		for (int i=1,k=n; i<=n; i++,k--) {
			int p=k;
			for (int j=i;j<=n; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<i; j++) {
				System.out.print(p+++" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print(p--+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleNumberPattern fl=new TriangleNumberPattern();
		fl.pyramid();
	}
}
