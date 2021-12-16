package chapter_02;

import java.util.Scanner;

public class Q_08 {
	// 한 해의 경과 일 수를 계산하는 프로그램
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년
	};

	// 평년인지 윤년인지 판단하는 메서드
	// 경과 일 수를 구할 때 2차원배열을 이용하므로 필요
	static int isLeap(int year) {
		int y = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		// 윤년이면 1 평년이면 0을 반환

		return y;
	}

	// 서기 y년 m월 d일의 그 해 경과 일수를 구함
	// while문을 이용하여 만들기
	static int dayOfYear(int y, int m, int d) {
		int days = 0;
		int n = 1;
		
		// 그 해 월의 지난 일수
		while (n < m) {
			days += mdays[isLeap(y)][n-1];
			n++;
		}
		
		days += d; // 해당 월의 지난 일수
		return days;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("그 해 경과 일 수를 구합니다.");
		System.out.print("년 : ");
		int y = scan.nextInt();
		System.out.print("월 : ");
		int m = scan.nextInt();
		System.out.print("일 : ");
		int d = scan.nextInt();

		int days = dayOfYear(y, m, d);

		System.out.println("그 해 " + days + "일째입니다.");

	}
}