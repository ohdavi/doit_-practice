package chapter_01;

import java.util.Scanner;

public class Q_01 {
	//네 값의 최댓값을 구하라.
	static int max4(int a, int b, int c, int d) {
		//max에 a를 대입시켜 바로 비교할 수 있게 한다.
		int max = a;
		
		//비교하는 숫자가 max보다 크면 max에 비교하는 숫자를 대입한다.
		if(b > max) max = b; 
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		//입력받기 위해 Scanner 생성
		Scanner scan = new Scanner(System.in);
		
		//입력받은 값 저장을 위한 변수 선언
		int a,  b,  c,  d;
		
		//a,b,c,d 네 값 입력받기
		System.out.print("a : ");
		a = scan.nextInt();
		System.out.print("b : ");
		b = scan.nextInt();
		System.out.print("c : ");
		c = scan.nextInt();
		System.out.print("d : ");
		d = scan.nextInt();
		
		//입력받은 네 값을 파라미터로 넘겨주고 리턴값을 max에 넣는다.
		int max = max4(a, b, c, d);
		
		//최댓값 출력
		System.out.println("네 값의 최댓값 : " + max);
	}

}
