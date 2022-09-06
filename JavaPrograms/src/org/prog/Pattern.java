package org.prog;

public class Pattern {
public void RightSideTriangle() {
	int n=5;
	for (int i = 1; i <=n; i++) {
		for (int j = i; j <=n; j++) {
			System.out.print("  ");
		}
		for (int k=1; k <=i; k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
public void RightSideInvertTriangle() {
	int n=5;
	for (int i = 1; i <=n; i++) {
		for (int j = i; j <=n; j++) {
			System.out.print("  ");
		}
		for (int k=1; k <=i; k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
