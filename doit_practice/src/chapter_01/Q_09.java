package chapter_01;

import java.util.Scanner;

public class Q_09 {
	// 정수a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 만들기
	
	static int sumof_1(int a, int b) {
		//어떤 수가 작은 지 비교해야함. 기본적으로 a를 작은수로 넣기
		int min = a;
		int max = b;
		int sum = 0;

		//a가 더 큰 수일 경우 b를 min, a를 max에 대입한다.
		if (a > b) {
			min = b;
			max = a;
		}
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}

		return sum;
	}
	
	//가우스의 덧셈
	static int sumof_2(int a, int b) {
		int min, max;
		
		if (a < b) {
			min = a;
			max = b;
		}else {
			min = b;
			max = a;
		}
		
		//(n/2)부분, 짝이 맞는 갯수를 찾아야함.
		//큰수에서 작은수를 뺄셈할 때 홀수이면 +1을 하고 2로 나누고 짝수면 2로 나눈다.
		int n = (max - min) % 2 != 0 ? ((max - min + 1) / 2) : ((max - min) / 2);
		
		//1이 있던 자리에 min을 n이 있던 자리에 max를 넣어 계산한다.
		int sum = (min + max) * n + ((min + max) % 2 == 0 ? (min + max) / 2 : 0);

		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;
		System.out.print("a : ");
		a = scan.nextInt();
		System.out.print("b : ");
		b = scan.nextInt();

		int sum1 = sumof_1(a, b);
		int sum2 = sumof_2(a, b);

		if (a < b) {
			System.out.println(a + "부터 " + b + "까지의 합 : " + sum1);
			System.out.println(a + "부터 " + b + "까지의 합 : " + sum2);
		} else {
			System.out.println(b + "부터 " + a + "까지의 합 : " + sum1);
			System.out.println(b + "부터 " + a + "까지의 합 : " + sum2);
		}
	}

}
