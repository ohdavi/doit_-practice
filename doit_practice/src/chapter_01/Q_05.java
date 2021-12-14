package chapter_01;

public class Q_05 {
	// 문제
	// med3_2가 med3_1보다 효율이 떨어지는 이유를 말해보자.
	static int med3_1(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	static int med3_2(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (b <= a && c > b))
			return b;
		return c;
	}

	// 나의 답: 비교연산자가 많아서 코드를 한번에 이해하기 힘들고 정확성이 떨어진다.

	// 해답
	// 가장 처음의 if문의 판단
	// if ((b >= a && c<= a) || (b <= a && c >= a))
	// 에 주목합니다. 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의
	// else if ((a > b && c < b) || (b <= a && c > b))
	// 으로 수행합니다. 결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.

}
