package org.prog;

public class TriangleStarPattern {
	
	public void Incrementtriangle() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void Decrementtriangle() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void RightSideDecrementTriangle() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("  ");
			}
			for (int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void RightSideIncrementTriangle() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j=i; j <=n; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void Triangle() {
		int n=5;
		for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<i; j++) {
				System.out.print("* ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void ReverseTriangle() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("  ");
			}
			for (int j=i; j<n; j++) {
				System.out.print("* ");
			}
			for (int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void TriangleDiamond() {
		int n=5;
		for (int i=1; i<n; i++) {
			for (int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<i; j++) {
				System.out.print("* ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("  ");
			}
			for (int j=i; j<n; j++) {
				System.out.print("* ");
			}
			for (int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleStarPattern triangle=new TriangleStarPattern();
		triangle.TriangleDiamond();
	}
}
