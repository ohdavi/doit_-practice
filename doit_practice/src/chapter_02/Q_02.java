package chapter_02;

public class Q_02 {
	// 배열 요소 역순으로 정렬하기

	// 배열 인덱스 자리 바꾸기
	static void swqp(int[] a, int idx1, int idx2) {
		int x = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = x;
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a, int i) {
			swqp(a, i, a.length - i - 1);
	}

	public static void main(String[] args) {
		int[] a = { 5, 10, 73, 2, -5, 42 };
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1) + "]를 교환합니다.");
			reverse(a,i);
			for (int j : a) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}

}
