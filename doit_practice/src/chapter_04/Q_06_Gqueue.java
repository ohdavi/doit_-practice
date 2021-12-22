package chapter_04;

import chapter_04.Q_05_IntQueue.EmptyIntQueueException;
import chapter_04.Q_05_IntQueue.OverflowIntQueueException;

public class Q_06_Gqueue<E> {
	private int max; // 큐의 용량
	private int num; // 현재 데이터 수
	private int front; // 프런트 요소 커서
	private int rear; // 리어 요소 커서
	private E[] que; // 큐의 본체

	// 생성자
	public Q_06_Gqueue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = (E[]) new Object[max];
			// E와 같은 실체화 불가 타입으로는 배열을 만들 수 없다.
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public static class EmptyGqueueException extends RuntimeException {
		public EmptyGqueueException() {
		}
	}

	public static class OverflowGqueueException extends RuntimeException {
		public OverflowGqueueException() {
		}
	}

	public E enque(E e) throws OverflowGqueueException {
		if (num >= max)
			throw new OverflowGqueueException(); // 큐가 가득 참
		que[rear++] = e;
		num++;
		if (rear == max)
			rear = 0;
		return e;
	}

	public E deque() throws EmptyGqueueException {
		if (num <= 0)
			throw new EmptyGqueueException(); // 큐가 비어 있음
		E e = que[front++];
		num--;
		if (front == max)
			front = 0;
		return e;
	}

	public E peek() throws EmptyGqueueException {
		if (num <= 0)
			throw new EmptyGqueueException(); // 큐가 비어 있음
		return que[front];
	}

	public int indexOf(E e) {
		for (int i = 0; i < num; i++) {
			if (que[(i + front) % max] == e) // 검색 성공
				return (i + front) % max;
		}
		return -1; // 검색 실패
	}

	public void clear() {
		num = front = rear = 0;
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
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
}
