package chapter_01;

public class Q_12 {
	//구구단표
	public static void main(String[] args) {

		System.out.print("  | ");

		for (int i = 1; i < 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("---+--------------------------");

		for (int j = 1; j < 10; j++) {
			System.out.print(j + " | ");
			for (int n = 1; n < 10; n++) {
				System.out.print(j * n + " ");
			}
			System.out.println();
		}
	}

}
