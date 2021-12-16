package chapter_02;

import java.util.Scanner;

public class Q_09 {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년
	};

	static int isLeap(int year) {
		int y = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;

		return y;
	}

	//남은 일수를 구하는 메서드 만들기
	static int leftDayOfYear(int y, int m, int d) {
		int days = 365;
		int n = 1;
		
		//윤년이면 366일
		if(isLeap(y) == 1) {
			days =366;
		}
		
		// 그 해 월의 지난 일수
		while (n < m) {
			days -= mdays[isLeap(y)][n-1];
			n++;
		}
		days -= d; // 해당 월의 지난 일수
		
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

		int days = leftDayOfYear(y, m, d);

		System.out.println("그 해 " + days + "일 남았습니다.");
	}
}