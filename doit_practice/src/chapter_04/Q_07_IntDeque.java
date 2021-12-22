package chapter_04;

public class Q_07_IntDeque {
	private int max; // 큐의 용량
	private int front; // 첫 번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	// 생성자
	public Q_07_IntDeque(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int enqueFront(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException();
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	public int enqueRear(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException();
		num++;
		if (front < 0)
			front = max - 1;
		que[front] = x;
		return x;
	}

	public int dequeFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException();
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	public int dequeRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException();
		num--;
		if (--rear < 0)
			rear = max - 1;
		int x = que[rear];
		return x;
	}

	public int peekFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException();
		return que[front];
	}

	public int peekRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException();
		if (rear == 0) {
			rear = max - 1;
		}
		return que[rear - 1];
	}

	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) // 검색 성공
				return idx;
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