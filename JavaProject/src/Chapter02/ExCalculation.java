package Chapter02;

import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
		
		/* 
				1. 스캐너를 이용해서 2개의 실수를 입력받고
				2. 덧셈 , 뺄셈 , 곱셈 , 나눗셈을 출력하는 프로그램을 작성하라 .
		 
		 */


		// 내가해본 방법
		// Student()
		
		// 강사님이 하신 방법
		// Teacher()
		
	}
	
	
	
	
	
	
	void Student() {
		// 스캐너 준비
		Scanner stdin = new Scanner(System.in);
		
		
		// 입력받기
		System.out.print("첫번째 숫자를 입력해주세요 > ");
		double a = stdin.nextDouble();
		
		System.out.print("두번째 숫자를 입력해주세요 > ");
		double b = stdin.nextDouble();
		
		
		// 결과 출력하기
		System.out.printf( "a+b=  %.1f \n", (a + b) );
		System.out.printf( "a-b=  %.1f \n", (a - b) );
		System.out.printf( "a*b=  %.1f \n", (a * b) );
		System.out.printf( "a/b=  %.1f \n", (a / b) );
		
		// 스캐너 종료
		stdin.close();
	}
	
	
	void Teacher() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2개의 실수 입력>>");
		
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		
		System.out.println( "두수의 덧셈은" + (a+b) );
		System.out.println( "두수의 뺄셈은" + (a-b) );
		System.out.println( "두수의 곱셈은" + (a*b) );
		System.out.println( "두수의 나눗셈은" + (a/b) );
		
		scanner.close();
	}
	
	
}
