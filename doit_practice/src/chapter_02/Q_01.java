package chapter_02;

import java.util.Random;

public class Q_01 {
	// 사람수와 키를 난수로 생성하기 + 최댓값 구하기

	static int maxOf(int[] a) {
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random(10);
		int num = rand.nextInt(10);
		System.out.println("사람수: " + num);

		int[] height = new int[num];

		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		System.out.println("최댓값 : " + maxOf(height));
	}

}
