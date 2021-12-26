package chapter_05;

import java.util.Scanner;

public class Q_06 {
	// 실습 5-6능 숫자가 아닌 A 기둥 ,B 기둥, C 기둥으로 출력하기
	// no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);
		//6 - x - y == 남은 기둥

		System.out.print("원반[" + no + "]을 ");

		switch (x) {
		case 1:
			System.out.print("A 기둥에서 ");
			break;
		case 2:
			System.out.print("B 기둥에서 ");
			break;
		case 3:
			System.out.print("C 기둥에서 ");
			break;
		}
		switch (y) {
		case 1:
			System.out.println("A 기둥으로 옮김");
			break;
		case 2:
			System.out.println("B 기둥으로 옮김");
			break;
		case 3:
			System.out.println("C 기둥으로 옮김");
			break;
		}

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	// 답안지
//	static String[] name = { "A기둥", "B기둥", "C기둥" };
//	System.out.println("원반[" + no + "]를 " + name[x - 1] + "에서 " + name[y - 1] + "으로 옮김");
	// 1 = A 기둥 , 2 = B 기둥, 3 = C 기둥 이어서 switch문이 생각이 나서 만들었지만 x,y가 똑같기 때문에 단순하고 비효율적으로 만들어졌다.
	// 답안지는 배열을 이용해서 깔끔하게 만들었다.

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("하노이의 탑");
		System.out.print("원반 개수：");
		int n = stdIn.nextInt();

		move(n, 1, 3); // 1번 기둥의 n개를 3번 기둥으로 옮김
	}
}
