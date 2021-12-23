package chapter_05;

public class Q_04 {
	// recur 메서드를 보고 하향식 분석과 상향식 분석을 수행하기
	static void recur(int n) {
		if (n > 0) {
			recur(n - 2);
			System.out.println(n);
			recur(n - 1);
		}
	}
	// n = 4
	// 전달받은 값이 0이하면 메서드는 아무일도 하지 않음
	
	// 하향식 분석, top-down, 가장 위쪽에 위치한 메서드 호출부터 계단식으로 자세히 조사하는 분석 방법
	//										recur(4) = 2, 1, 4, 1, 3, 2, 1
	// 			 recur(2)=2,1					 4,						 recur(3)=1,3,2,1
	// recur(0)=X,	2,	recur(1)=1							recur(1)=1,				 3, 		recur(2)=2,1		
	//					recur(-1)=X, 1, recur(0)=X			recur(-1)=X, 1, recur(0)=X			recur(0)=X, 2, recur(1)=1
	//																									 		recur(-1)=X, 1, recur(0)=X

	// 상향식 분석, bottom-up, 아래쪽부터 쌓아 올리며 분석하는 방법
	// recur(1) -> rescur(-1), 1, recur(0) = 1
	// recur(2) -> rescur(0), 2, recur(1) = 2, 1
	// recur(3) -> rescur(1), 3, recur(2) = 1, 3, 2, 1
	// recur(4) -> rescur(2), 4, recur(3) = 2, 1, 4, 1, 3, 2, 1
	

}
