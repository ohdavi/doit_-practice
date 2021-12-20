package chapter_04;

import chapter_04.IntStack.OverflowIntStackException;

public class Q_02_Gstack<E> {
//	제네릭 타입
//	<T>	Type
//	<E>	Element
//	<K>	Key
//	<V>	Value
//	<N>	Number
//	파라미터로 명시할 수 있는 것은 참조 타입(Reference Type) : String, Integer, Double

	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private E[] stk; // 스택 본체

	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {
		}
	}

	// 실행할 때 예외：스택이 가득 참
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {
		}
	}

	// 생성자
	public Q_02_Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];
		} catch (OutOfMemoryError e) {
			max = 0;
//			메모리 누수에 대한 한 가지 일반적인 표시는 java.lang.OutOfMemoryError 예외(Exception)
//			일반적으로 Java 힙 메모리에서 오브젝트를 할당하기에 불충분 한 공간이있을 때 발생
		}
	}

//	push : 데이터 넣기
	public E push(E e) throws OverflowGstackException { // 메소드 내부에서 try~catch로 에러처리를 하지 않으면 throws를 통해서 에러를 던지도록 요구한다.
		if (ptr >= max) {
			throw new OverflowGstackException();
			// ptr이 max보다 크거나 같으면 스택이 가득 찼다는 의미이므로 throw를 이용해 오류 발생시킨다.
		}
		return stk[ptr++] = e;
	}

//	pop	: 꼭대기에 있는 데이터 삭제
	public E pop() throws EmptyGstackException {
		if (ptr <= 0) {
			throw new EmptyGstackException();
			// ptr이 0보다 작거나 같으면 스택이 비어 있다는 의미이므로 오류 발생시키기
		}
		return stk[--ptr];
	}

//	peek : 꼭대기에 있는 데이터 보기
	public E peek() {
		if (ptr <= 0) {
			throw new EmptyGstackException();
		}
		// 데이터의 입력과 출입은 없으므로 ptr의 변화는 X
		// 꼭대기의 데이터를 반환해야하니 -1을 해준다.
		return stk[ptr - 1];
	}

//	indexOf : 검색하기
	public int indexOf(E e) {
		//꼭대기부터 검색, 큰 -> 작은
		//범위는 꼭대기(ptr-1) ~ 바닥(0,인덱스의 처음)
		for (int i = ptr-1; i >= 0; i--) {
			if (stk[i].equals(e)) {
				return i;
			}
		}
		// 검색 성공하면 해당 인덱스 반환 \, 검색 실패하면 -1 반환
		return -1;
	}

//	clear : 전체 삭제, 초기화
	public void clear() {
		ptr = 0;
	}
	
//	capacity	: 용량
	public int capacity() {
		return max;
	}
	
//	size : 스택의 데이터 수
	public int size() {
		return ptr;
	}
	
//	isEmpty  : 비어있는지 확인
	public boolean isEmpty() {
		return ptr <= 0;
	}

//	isFull : 가득 찼는지 확인
	public boolean isFull() {
		return ptr >= max;
	}

//	dump : 스택의 모든 데이터 출력(꼭대기부터)
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어 있습니다.");
		}
		for (int i = ptr-1; i >= 0; i--) {
			System.out.print(stk[i]);
		}
		System.out.println();
	}
}
