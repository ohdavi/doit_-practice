package chapter_01;

import java.util.Scanner;

public class Q_03 {
	//네 값의 최솟값을 구하라
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		//비교하는 숫자가 min보다 작으면 min에 비교하는 숫자를 대입한다.
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d ;
		
		System.out.print("a : ");
		a = scan.nextInt();
		System.out.print("b : ");
		b = scan.nextInt();
		System.out.print("c : ");
		c = scan.nextInt();
		System.out.print("d : ");
		d = scan.nextInt();
		
		int min = min4(a,b,c,d);
		
		System.out.println("네 값의 최솟값 : " + min);
	}

}
