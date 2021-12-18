package chapter_03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q_07 {
	// 시력에 대한 내림차순 정렬의 신체검사 데이터에서 틍정 시력을 가진 사람을 검색하는 프로그램을 작성하세요
	// 제네릭

	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		// 생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		// 문지열을 반환하는 메서드
		public String toString() {
			return name + " " + height + " " + vision;
		}

		// 내림차순 comparator
		public static final Comparator<PhyscData> HEIGHT_ORDER = new VisionComparator();

		// 시력을 비교하는 클래스(Comparator 인터페이스와 compare 메서드를 구현한 클래스)
		private static class VisionComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				if (d1.vision < d2.vision) {
					return 1;
				} else if (d1.vision > d2.vision) {
					return -1;
				} else {
					return 0;
				}
				// 답안지
//				return (d1.vision > d2.vision) ? 1 : (d1.vision < d2.vision) ? -1 : 0;
				// 답안지 오름차순인 것 같다..
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		PhyscData[] x = { // 배열의 요소는 시력순이지 않으면 안됩니다.
				new PhyscData("이나령", 162, 2.0), new PhyscData("유지훈", 168, 1.4), new PhyscData("전서현", 173, 1.1),
				new PhyscData("김한결", 169, 0.8), new PhyscData("이호연", 174, 0.6), new PhyscData("홍준기", 171, 0.5),
				new PhyscData("이수민", 175, 0.1), };

		System.out.print("검색할 시력 : ");
		double vision = scan.nextDouble();

		int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.HEIGHT_ORDER);

		if (idx < 0) {
			System.out.println("검색한 시력이 없습니다.");
		} else {
			System.out.println("그 값은 " + "x[" + idx + "]에 있습니다.");
			System.out.println("데이터：" + x[idx]);
		}

	}

}
