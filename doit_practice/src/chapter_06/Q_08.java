package chapter_06;

public class Q_08 {
	// 배열에서 이미 정렬된 부분은 이진 검색을 사용할 수 있기 떄문에 이진 검색을 사용하여 수정하기
	static void BinarySearchInsertionSort(int[] x, int n) {
		for (int i = 0; i < n - 1; i++) {
			int key = x[i];
			int low = 0;
			int high = i - 1;
			int mid;

			do {
				mid = (low + high) / 2;
				if (x[mid] == key)
					break;
				else if (x[mid] < key)
					mid = mid + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
				else
					high = mid - 1; // 검색 범위를 앞쪽 절반으로 좁힘
			} while (low <= high);
		}
	}

	// 답안지
	static void binInsertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int key = a[i];
			int pl = 0; // 검색범위 맨 앞의 인덱스
			int pr = i - 1; // 검색범위 맨 뒤의 인덱스
			int pc; // 〃 중앙의 인덱스
			int pd; // 삽입하는 위치의 인덱스

			do {
				pc = (pl + pr) / 2;
				if (a[pc] == key) { // 검색성공
					break;
				} else if (a[pc] < key) {
					pl = pc + 1;
				} else {
					pr = pc - 1;
				}
			} while (pl <= pr);
			pd = (pl <= pr) ? pc + 1 : pr + 1;
			// 왜 pd값을 pl이 pr보다 크면 pr+1이고, pl이 pr과 같거나 작을때 pc+1을 하는 걸까
			for (int j = i; j > pd; j--) {
				a[j] = a[j - 1];
				//[pd]에 key값을 넣어야하기 때문에 뒤로 한칸씩 밀려야 한다.
			}
			a[pd] = key;
		}
	}
	// 풀지 못했다. 다시 풀어보자.

	public static void main(String[] args) {
		int[] x = { 6, 4, 8, 3, 1, 9, 7, 2, 5 };
		int n = x.length;

//		BinarySearchInsertionSort(x, n);
		binInsertionSort(x, n);

		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]＝" + x[i]);
		}
	}
}
