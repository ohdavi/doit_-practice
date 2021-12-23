package chapter_05;

import java.util.Scanner;

public class Q_01 {
	// 재귀 메서드 호출을 사용하지 않고 factorial 메서드를 작성하기
//	static int factorial(int n) {
//		if (n > 0)
//			return n * factorial(n - 1);
//		else
//			return 1;
//	}

	static int factorial(int n) {
		int f = 1;
		for (; n > 0; ) {
			f *= n--;
		}
		if (n < 0) {
			return 1;
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 : ");
		int n = scan.nextInt();

		System.out.println(n + "의 factorial은  " + factorial(n) + "입니다.");
	}

}
