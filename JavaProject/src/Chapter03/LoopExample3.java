package Chapter03;
/*
 * do while 문 사용
 * 변화되는 i 값 출력
 */
public class LoopExample3 {
	public static void main(String[] args) {
		int i=10;
		
//		do while 문 => 최초 한번 실행은 보장
		do {
//			i의 값: 10 => 한번만 출력
			System.out.println("i의 값: "+ i);
			i--; // 9 바뀌고,
//		9<3 => 거짓으로 종료
		} while (i<3); //시작하자마자 거짓이기 때문
	}
}
