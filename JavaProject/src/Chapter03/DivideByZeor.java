package Chapter03;

import java.util.Scanner;

/*
 * 나눗셈(분자, 분모 입력받음)
 * 몫을 출력(분모가  0인 경우 불능)
 */
public class DivideByZeor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("분모를 입력하시오");
		dividend = scan.nextInt();
		System.out.print("분자를 입력하시오");
		divisor = scan.nextInt();
//		분모를 입력하시오100
//		분자를 입력하시오0
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at Programmers.DivideByZeor.main(DivideByZeor.java:21)

		System.out.println(dividend+"를"+divisor+"로 나누면 몫은"
				+dividend/divisor+"입니다");
		scan.close();
	}
}
