package chapter_05;

import java.util.Scanner;
import java.util.Stack;

public class Q_05 {
	// recur 메서드를 비재귀적으로 구현하기
//	static void recur(int n) {
//		recur(n - 1);
//		recur(n - 2);
//		System.out.println(n);
//	}

	// 실습 5-4 ~ 5-5 재귀의 제거로 만들었다.
	static void recur(int n) {
		Stack<Integer> stack = new Stack<Integer>();

		while (true) {
			if (n > 0) {
				stack.push(n);
				n = n - 1;
				continue;
			}

			if (stack.isEmpty() != true) {
				n = stack.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}

	// 답안지
	static void recur3(int n) {
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		int ptr = -1;
		int sw = 0;

		while (true) {
			if (n > 0) {
				ptr++;
				nstk[ptr] = n;
				sstk[ptr] = sw;

				if (sw == 0)
					n = n - 1;
				else if (sw == 1) {
					n = n - 2;
					sw = 0;
				}
				continue;
			}
			do {
				n = nstk[ptr];
				sw = sstk[ptr--] + 1;

				if (sw == 2) {
					System.out.println(n);
					if (ptr < 0)
						return;
				}
			} while (sw == 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요.：");
		int x = stdIn.nextInt();

		recur(x);
	}

}
