package chapter_04;

import chapter_04.Q_03.AorB;
import chapter_04.Q_03.EmptyGstackException;

public class Q_04_IntAryQueue {
	private int max; // 큐 용량
	private int num; // 큐 데이터 수
	private int[] que; // 큐 본체

	// 생성자
	public Q_04_IntAryQueue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException() {
		}
	}

	public class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException() {
		}
	}

	// enque : 데이터를 넣음
	public int enque(int n) throws OverflowIntAryQueueException {
		if (num >= max) {
			throw new OverflowIntAryQueueException();
		}
		return que[num++] = n;
	}

	// deque : 데이터를 꺼냄
	public int deque() throws EmptyIntAryQueueException {
		int n = que[0];

		if (num <= 0) {
			throw new EmptyIntAryQueueException();
		}
		// 맨앞의 데이터를 꺼낸후 뒤에 남은 데이터를 앞으로 옮긴다.
		// 한칸씩 앞당겨 지기 떄문에 범위는 현재 데이터수보다 -1을 하면 된다.
		for (int i = 0; i < num - 1; i++) {
			que[i] = que[i + 1];
		}
		return n;
	}

	public int peek() throws EmptyGstackException {
		if (num <= 0) {
			throw new EmptyGstackException();
		}
		return que[num - 1];
	}

	public int indexOf(int n) {
		for (int i = 0; i > num; i++) {
			if (que[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		num = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}

	public void dump() {
		if (num <= 0) {
			System.out.println("스택이 비어 있습니다.");
		}
		for (int i = 0; i < num; i++) {
			System.out.print(que[i] + "\t");
		}
		System.out.println();
	}
}
