package chapter_01;

import java.util.Scanner;

public class Q_16 {
	// n단의 피라미드를 출력
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			//왼쪽공백은 단마다 -1씩 되어야한다.
			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			//*은 홀수로 늘어난다.
			for (int j = 0; j < ((i - 1) * 2 + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("단 : ");
		int n = scan.nextInt();
		spira(n);
	}

}
