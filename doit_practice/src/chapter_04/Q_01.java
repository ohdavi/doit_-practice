package chapter_04;

import java.util.Scanner;

public class Q_01 {
	// 클래스 IntStack의 모든 메서드를 사용하는 프로그램을 작성하라

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		IntStack stack = new IntStack(10);

		while (true) {
			System.out.println("현재 데이터 수 : " + stack.size() + "/" + stack.capacity());

			System.out.println("1.push	2.pop	3.peek	4.indexOf	5.clear	"
					+ "6.capacity	7.size	8.isEmpty	9.isFull 	10.dump		0.종료");
			System.out.print("메뉴 : ");
			int menu = scan.nextInt();
			if (menu == 0)
				break;

			int n;
			
			switch (menu) {

			case 1:
				System.out.print("데이터 : ");
				n = scan.nextInt();
				try {
					stack.push(n);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					stack.pop();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3:
				try {
					n = stack.peek();
					System.out.println("peek 데이터는 " + n + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 4:
				System.out.print("데이터 : ");
				n = scan.nextInt();
				int idx = stack.indexOf(n);
				if (idx == -1) {
					System.out.println("해당 데이터가 없습니다.");
				} else {
					System.out.println(n + "은 stack[" + idx + "]에 있습니다.");
				}
				break;
			case 5:
				stack.clear();
				break;
			case 6:
				n = stack.capacity();
				System.out.println("스택의 용량은 " + n + "입니다.");
				break;
			case 7:
				n = stack.size();
				System.out.println("스택에 있는 데이터 수는 " + n + "입니다.");
				break;
			case 8:
				if (stack.isEmpty()) {
					System.out.println("비어 있습니다.");
				} else {
					System.out.println("비어 있지 않습니다.");
				}
				break;
			case 9:
				if (stack.isFull()) {
					System.out.println("가득 찼습니다.");
				} else {
					System.out.println("가득 차지 않았습니다.");
				}
				break;
			case 10:
				stack.dump();
				break;
			}

		}

	}

}
