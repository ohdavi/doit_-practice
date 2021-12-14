package chapter_02;

import java.util.Scanner;

public class Q_03 {
	// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 만들기

	// 배열 a의 요소를 역순으로 정렬
	static int sumOf(int[] a) {
		int sum =0;
		
		for(int i : a) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("배열의 크기 : ");
		int num = scan.nextInt();
		int[] a = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = scan.nextInt();
		}
		
		int sum = sumOf(a);
		System.out.println("배열 모든 요소의 합계 : " + sum);
	}

}
