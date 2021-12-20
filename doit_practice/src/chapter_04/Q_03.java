package chapter_04;

import chapter_04.IntStack.OverflowIntStackException;

public class Q_03 {
//	제네릭 타입
//	<T>	Type
//	<E>	Element
//	<K>	Key
//	<V>	Value
//	<N>	Number
//	파라미터로 명시할 수 있는 것은 참조 타입(Reference Type) : String, Integer, Double

	// 하나의 배열을 공유하여 2개의 스택을 구현.
	// 양 끝이 스택의 바닥
	private int max; // 스택 용량
	private int ptr1; // 스택 포인터1
	private int ptr2; // 스택 포인터2
	private int[] stk; // 스택 본체

	public enum AorB {
		StackA, StackB
	};

	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {
		}
	}

	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {
		}
	}

	// 생성자
	public Q_03(int capacity) {
		ptr1 = 0;
		ptr2 = capacity - 1;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

//	push : 데이터 넣기
	public int push(AorB ab, int n) throws OverflowGstackException {
		if (ptr1 >= ptr2 + 1) // 스택이 가득 참
			throw new OverflowGstackException();
		switch (ab) {
		case StackA:
			stk[ptr1++] = n;
			break;
		case StackB:
			stk[ptr2--] = n;
			break;
		}
		return n;
	}

//	pop	: 꼭대기에 있는 데이터 삭제
	public int pop(AorB ab) throws EmptyGstackException {
		int x = 0;
		switch (ab) {
		case StackA:
			if (ptr1 <= 0) // 스택 A가 비어 있음
				throw new EmptyGstackException();
			x = stk[--ptr1];
			break;
		case StackB:
			if (ptr2 >= max - 1) // 스택 B가 비어 있음
				throw new EmptyGstackException();
			x = stk[++ptr2];
			break;
		}
		return x;
	}

//	peek : 꼭대기에 있는 데이터 보기
	public int peek(AorB ab) {
		int x = 0;
		switch (ab) {
		case StackA:
			if (ptr1 <= 0) // 스택 A가 비어 있음
				throw new EmptyGstackException();
			x = stk[ptr1 - 1];
			break;
		case StackB:
			if (ptr2 >= max - 1) // 스택 B가 비어 있음
				throw new EmptyGstackException();
			x = stk[ptr2 + 1];
			break;
		}
		return x;
	}

//	indexOf : 검색하기
	public int indexOf(AorB ab, int n) {
		switch (ab) {
		case StackA:
			for (int i = ptr1 - 1; i >= 0; i--) {
				if (stk[i] == n) {
					return i;
				}
			}
		case StackB:
			for (int i = ptr2 + 1; i < max; i--) {
				if (stk[i] == n) {
					return i;
				}
			}
		}
		return -1;
	}

//	clear : 전체 삭제, 초기화
	public void clear(AorB ab) {
		switch (ab) {
		case StackA:
			ptr1 = 0;
			break;
		case StackB:
			ptr2 = max - 1;
			break;
		}
	}

//	capacity	: 용량
	public int capacity() {
		return max;
	}

//	size : 스택의 데이터 수
	public int size(AorB ab) {
		switch (ab) {
		case StackA:
			return ptr1;
		case StackB:
			return max - ptr2 - 1;
		}
		return 0;
	}

//	isEmpty  : 비어있는지 확인
	public boolean isEmpty(AorB ab) {
		switch (ab) {
		case StackA:
			return ptr1 <= 0;
		case StackB:
			return ptr2 >= max - 1;
		}
		return true;
	}

//	isFull : 가득 찼는지 확인
	public boolean isFull() {
		return ptr1 >= ptr2 + 1;
	}

//	dump : 스택의 모든 데이터 출력(바닥부터)
	public void dump(AorB ab) {
		switch (ab) {
		case StackA:
			if (ptr1 <= 0) {
				System.out.println("스택이 비어 있습니다.");
			}
			for (int i = 0; i < ptr1; i++) {
				System.out.print(stk[i] + "\t");
			}
			System.out.println();
			break;
		case StackB:
			if (ptr2 >= max - 1) {
				System.out.println("스택이 비어 있습니다.");
			}
			for (int i = max - 1; i > ptr2; i--)
				System.out.print(stk[i] + "\t");
			System.out.println();
			break;
		}
	}
}
