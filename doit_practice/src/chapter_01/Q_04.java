package chapter_01;

import java.util.Scanner;

public class Q_04 {
	//세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하기
	//결정 트리(decision tree)
	//median : 중앙값
	
	static int median(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a >= c) {
				return c;
			}else {
				return a;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {	
			return b;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("median(3,2,1), a>b>c : " + median(3,2,1));
		System.out.println("median(3,2,2), a>b=c : " + median(3,2,2));
		System.out.println("median(3,1,2), a>c>b : " + median(3,1,2));
		System.out.println("median(3,2,3), a=c>b : " + median(3,2,3));
		System.out.println("median(2,1,3), c>a>b : " + median(2,1,3));
		System.out.println("median(3,3,2), a=b>c : " + median(3,3,2));
		System.out.println("median(3,3,3), a=b=c : " + median(3,3,3));
		System.out.println("median(2,2,3), c>a=b : " + median(2,2,3));
		System.out.println("median(2,3,1), b>a>c : " + median(2,3,1));
		System.out.println("median(2,3,2), b>a=c : " + median(2,3,2));
		System.out.println("median(1,3,2), b>c>a : " + median(1,3,2));
		System.out.println("median(2,3,3), b=c>a : " + median(2,3,3));
		System.out.println("median(1,2,3), c>b>a : " + median(1,2,3));
	}
}
