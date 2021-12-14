package chapter_01;

import java.util.Scanner;

public class Q_15 {
	// 왼쪽 아래가 직각인 이등변 삼각형 출력
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 왼쪽 위가 직각인 이등변 삼각형 출력
	static void triangleLU(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 오른쪽 위가 직각인 이등변 삼각형 출력
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 오른쪽 아래가 직각인 이등변 삼각형 출력
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("단 : ");
		int n = scan.nextInt();
		triangleLB(n);
		System.out.println();
		triangleLU(n);
		triangleRU(n);
		System.out.println();
		triangleRB(n);
	}

}
