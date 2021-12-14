package chapter_01;

import java.util.Scanner;

public class Q_08 {
	// 가우스의 덧셈을 이용하여 1부터 n까지의 합을 구하라.
       	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("n의 값 : ");
		int n = scan.nextInt();

		int sum = 0;

		sum = (1+n)*(n/2);
		
		if(n%2!=0){ 
			sum += (n+1)/2;
		}
		// n이 홀수일 때 중간에 남은 한 개의 값을 추가로 더해줘야 함.
		
		System.out.println("1부터 n까지의 합 : " + sum);

	}

}
