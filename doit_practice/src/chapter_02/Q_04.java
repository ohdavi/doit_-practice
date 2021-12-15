package chapter_02;

import java.util.Scanner;

public class Q_04 {
	// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하라.

	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length? a.length : b.length;
		for(int i=0; i<num; i++) {
			a[i] = b[i];
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 a의 크기 : ");
		int num1 = scan.nextInt();
		int[] a = new int[num1];
		
		for (int i = 0; i < num1; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = scan.nextInt();
		}
		
		System.out.print("배열 b의 크기 : ");
		int num2 = scan.nextInt();
		int[] b = new int[num2];

		for (int i = 0; i < num2; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = scan.nextInt();
		}

		copy(a, b);

		System.out.println("복사완료");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
	}

}
