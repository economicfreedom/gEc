package Chapter02;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		
		// 내가 작성했던 메소드
		Student();
		
		// 강사님이 작성해주신 메소드
		// Teacher();
		
	}
	
	
	/* 내가 작성했던 소스코드 */
	public static void Student() {
		// 준비
		Scanner stdin = new Scanner(System.in);
		
		// 입력받기
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int onehwa = stdin.nextInt();
		
		// 계산
		double dollar = onehwa/1100;
		
		// 출력
		System.out.println( onehwa + "원은  $" + dollar + "달러 입니다." );
		
		// 스캐너 종료
		stdin.close();
		
	}
	
	
	
	/* 강사님이 작성해주신 소스코드 */
	public static void Teacher() {
		
		// 상수를 이용해서, 환율 고정한다. ( 변수명은 모두 대문자로 작성 )
		final double RATE = 1100.0;
		
		// 스캐너 객체생성
		Scanner scanner = new Scanner(System.in);
		
		// 입력받기
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = scanner.nextInt();
		
		// 계산 ( 정수 / 실수 = 실수타입, 자동형변환  int -> double )
		double dollar = won/RATE;
		
		// 출력
		System.out.println(won + "원은 $" + dollar + "입니다.");
		
		// 스캐너 종료
		scanner.close();
		
	}
	
	
	
	
}
