package Chapter03;

import java.util.Scanner;

public class DivideByZeroHandling {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividend;
		int divisor;
		
		while (true) {
			
			System.out.print("분모를 입력하시오");
			dividend = scan.nextInt();
			System.out.print("분자를 입력하시오");
			divisor = scan.nextInt();
			try {
//				불능이 발생할수 있는 실행문
				System.out.println(dividend+"를"+divisor+"로 나누면 몫은"
						+dividend/divisor+"입니다");
				break;
				
//			불능일때 정상적인 메세지로 처리
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
				
			}
		}
//		분모를 입력하시오100
//		분자를 입력하시오0
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at Programmers.DivideByZeor.main(DivideByZeor.java:21)

		scan.close();


	}
}
