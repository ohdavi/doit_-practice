package chapter_01;

import java.util.Scanner;

public class Q_02 {
	//세 값의 최솟값을 구하라
	static int min3(int a, int b, int c) {
		int min = a;
		
		//비교하는 숫자가 min보다 작으면 min에 비교하는 숫자를 대입한다.
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("a : ");
		a = scan.nextInt();
		System.out.print("b : ");
		b = scan.nextInt();
		System.out.print("c : ");
		c = scan.nextInt();
		
		int min = min3(a,b,c);
		
		System.out.println("세 값의 최솟값 : " + min);
	}

}
