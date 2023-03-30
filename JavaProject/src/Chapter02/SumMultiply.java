package Chapter02;
import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		
		// 준비
		Scanner stdIn = new Scanner(System.in);
		
		// 입력
		System.out.print("2개의 정수 입력(숫자 숫자) >> ");		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
				
		// 출력
		System.out.println( "두수의 합은 " + (a+b) );
		System.out.println( "두수의 곱은" + (a*b) );
		
		
	}
}
