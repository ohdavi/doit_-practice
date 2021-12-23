package chapter_05;

import java.util.Scanner;

public class Q_02 {
	// 재귀 메서드 호출을 사용하지 않고 gcd 메서드를 작성하기
//	static int gcd(int x, int y) {
//		if (y == 0)
//			return x;
//		else
//			return gcd(y, x % y);
//	}
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		int n;
		for (; b > 0;) {
			n = a % b;
			a = b;
			b = n;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 a : ");
		int a = scan.nextInt();
		System.out.print("정수 b : ");
		int b = scan.nextInt();

		System.out.println("최대 공약수는 " + gcd(a, b) + "입니다.");
	}

}
