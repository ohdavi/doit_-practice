package chapter_03;

import java.util.Arrays;
import java.util.Scanner;

public class Q_06 {
	// 검색에 실패하면 삽입 포인트의 값을 출력하는 프로그램을 작성하기

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] a = { 1, 4, 8, 15, 36, 44, 67, 99 };

		System.out.print("검색할 값: ");
		int key = scan.nextInt();

		int idx = Arrays.binarySearch(a, key);

		//검색 실패시 -삽입포인트-1을 반환하기 떄문에 idx가 0보다 작으면 검색실패
		if (idx < 0) {
			System.out.println("그 값의 요소가 없습니다.");
			System.out.println("삽입 포인트 : " + (-idx - 1));
		} else {
			System.out.println(key + "는 x[" + idx + "]에 있습니다.");
		}

	}

}
