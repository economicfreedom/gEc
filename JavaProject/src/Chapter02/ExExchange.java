package Chapter02;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		
		// 내가 작성한 소소크도
		Student();
	
		// 강사님이 작성해주신 소스코드
		// Teacher();
		

	}
	
	
	
	
	// 내가 작성한 소스코드
	public static void Student() {
		
		// 스캐너 객체생성
		Scanner scanner = new Scanner(System.in);
		
		// 상수 선언 (달러, 유로) 
		final double DOLLAR = 1200;
		final double EURO = 1500;
		
		// 원화 입력받기
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = scanner.nextInt();
		
		// 출력하기
		System.out.println( won + "원은 $" + (won/DOLLAR) + "입니다.");
		System.out.println( won + "원은 E" + (won/EURO) + "입니다.");
		
		// 스캐너 종료
		scanner.close();
		
	}
	
	
	
	
	// 강사님이 작성해주신 소스코드
	public static void Teacher() {

		// 상수 준비
		final double DOLLAR_RATE = 1200.0;
		final double EURO_RATE = 1500.0;
		
		// 스캐너로 입력받기
		Scanner scanner = new Scanner(System.in);
		System.err.print("원화를 입력하세요(단위 원)>>");
		int won = scanner.nextInt();
		
		// 계산하기
		double dollar = won/DOLLAR_RATE;
		double euro = won/EURO_RATE;
		
		// 출력하기
		System.out.println( won + "원은 $" + dollar + "입니다.");
		System.out.println( won + "원은 E" + euro + "입니다.");
		
		// 스캐너 종료
		scanner.close();
		
		
	}
	
	
	
	
}
