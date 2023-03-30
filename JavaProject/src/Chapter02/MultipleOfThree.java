package Chapter02;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		
		// 숫자를 입력받아서 3의 배수여부를 출력
		Scanner scanner = new Scanner(System.in);
		
		// 입력받기
		int number = scanner.nextInt();
		
		
		// 만약 3의 배수가 맞는지 확인 (3으로 나눈 값이 0 이면 3의 배수)
		if (number %3 == 0) {	System.out.println( "3의 배수가 맞습니다. "); }
		
		// 3의 배수가 아닐경우
		else { System.out.println("3의 배수가 아닙니다!"); } 
		
		
		// 스캐너 종료
		 scanner.close();
		
		
		
	}
}
