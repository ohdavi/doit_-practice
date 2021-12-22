package chapter_04;

public class Q_05_IntQueue {
	private int max; // 큐의 용량
	private int front; // 첫 번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	// 실행 시 예외：큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// 실행 시 예외：큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	// 생성자
	public Q_05_IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; // 큐 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}

	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException(); // 큐가 가득 참
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException(); // 큐가 비어 있음
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	// 큐에서 데이터를 피크 (프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException(); // 큐가 비어 있음
		return que[front];
	}

	// 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) // 검색 성공
				return idx;
		}
		return -1; // 검색 실패
	}

	// ------------ Q5 -------------
	// 임의의 데이터를 검색하는 메서드를 추가
	// 배열의 인덱스가 아닌 큐의 몇번째인지 양수로 반환, 프런트이면 1 반환, 검색 실패시 0 반환
	public int search(int x) {
		if (que[front] == x) {
			return 1;
		} else {
			for (int i = 1; i < num; i++) {
				if (que[(i + front) % max] == x) {
					return i;
				}
			}
		}
		return 0;
	}
	// 답안지
//	public int search(int x) {
//		for (int i = 0; i < num; i++)
//			if (que[(i + front) % max] == x) // 검색성공
//				return i + 1;
//		return 0; // 검색실패
//	}
	// 나는 프런트이면 1 반환하는 걸 따로 했는데 답안은 포함되어 있어서 훨씬 깔끔해보인다.
	
	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력
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