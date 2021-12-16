package chapter_02;

import java.util.Scanner;

public class Q_11 {

	static class YMD {
		int y;
		int m;
		int d;
		int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년
		};

		// 평년인지 윤년인지 판단하는 메서드
		// 윤년이면 1 평년이면 0을 반환
		int isLeap(int year) {
			return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		}

		// 생성자
		YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;

		}

		// n일 뒤의 날짜를 반환
		YMD after(int n) {
			YMD ymd = new YMD(this.y, this.m, this.d);

			ymd.d += n;

			//d가 일 수보다 작아야 하므로 크다면 뺄셈 반복
			while(ymd.d > mdays[isLeap(y)][m - 1]) {
				ymd.m++;
				ymd.d -= mdays[isLeap(y)][m - 1];
				if (ymd.m > 12) {
					ymd.y++;
					ymd.m -= 12;
				}
			}
			return ymd;
		}

		// n일 앞의 날짜를 반환
		YMD before(int n) {
			YMD ymd = new YMD(this.y, this.m, this.d);

			ymd.d -= n;

			//d가 1보다 작으면 안됨 -> 월을 뺴주고 일 수를 더해야함
			while(ymd.d <1) {
				ymd.m--;
				ymd.d += mdays[isLeap(y)][m - 1];
				if (ymd.m < 1) {
					ymd.y--;
					ymd.m += 12;
				}
			}
			return ymd;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = stdIn.nextInt();
		System.out.print("월：");
		int m = stdIn.nextInt();
		System.out.print("일：");
		int d = stdIn.nextInt();

		YMD data = new YMD(y, m, d);

		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = stdIn.nextInt();

		YMD before = data.before(n);
		YMD after = data.after(n);

		System.out.println(n + "일 앞의 날짜는 : " + before.y + "년 " + before.m + "월 " + before.d + "일 입니다.");
		System.out.println(n + "일 뒤의 날짜는 : " + after.y + "년 " + after.m + "월 " + after.d + "일 입니다.");
	}

}
