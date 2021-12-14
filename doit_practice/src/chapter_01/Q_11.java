package chapter_01;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수값 : ");
		int num = scan.nextInt();

		// 문자열로 바꿔서 길이 구하기
		String str = String.valueOf(num);
		System.out.println("그 수는 " + str.length() + "자리입니다.");

		// Math함수를 이용하기
		int length = (int) (Math.log10(num) + 1);
		System.out.println("그 수는 " + length + "자리입니다.");

		// 10으로 나누기
		int no = 0;
		while (num > 0) {
			num /= 10; // n을 10으로 나눔
			no++;
		}
		System.out.println("그 수는 " + no + "자리입니다.");
	}

}
