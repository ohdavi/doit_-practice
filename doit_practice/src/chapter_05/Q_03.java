package chapter_05;

import java.util.Scanner;

public class Q_03 {
	// 배열 a의 모든 요소의 최대공약수를 구하는 메서드를 작성하기
	static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}

	static int gcdArray(int[] a, int start, int no) {
		if (no == 1)
			// 배열의 요소가 1일 떄 해당 값 반환
			return a[start];
		else if (no == 2)
			// 배열의 요소가 2개일 때 첫 요소와 다음 요소의 최대 공약수를 구하여 반환
			return gcd(a[start], a[start + 1]);
		else
			// 처음 요소는 그대로 두고 다음 요소부터 배열 요소들을 하나씩 계속 파악한다.
			// 배열 갯수는 하나씩 줄어들면서 재귀적 호출 --> 모든 배열 요소가 gcd 작업을 거친 뒤
			// 마지막에 a[start]과 gcd 작업을 통해 배열 요소의 최대 공약수를 구하여 반환
			return gcd(a[start], gcdArray(a, start + 1, no - 1));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] a = { 66, 47, 23, 16 };

		System.out.println("최대 공약수는 " + gcdArray(a, 0, a.length) + "입니다.");
	}

}
