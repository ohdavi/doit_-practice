package chapter_01;

import java.util.Scanner;

public class Q_07 {
	//n이 7알때 합을 구하라.
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("n의 값 : ");
		int n = scan.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 n까지의 합 : " + sum);
	}

}
