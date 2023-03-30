package Chapter02;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		
		// 준비
		int width, height, result;
		Scanner stdIn = new Scanner(System.in);
		

		// 너비 입력받기
		System.out.print("원의 너비를 입력해주세요> ");
		width  = stdIn.nextInt();
		
		// 높이 입력받기
		System.out.print("원의 높이를 입력해주세요> ");
		height = stdIn.nextInt();		
		
		// 입력받은 값으로 사각형의 면적 구하기
		result = width * height;
		
		
		// 출력
		System.out.println("사각형의 면적은 " + result + "입니다. ");
		
		
		// 종료
		stdIn.close();
		
		
	}
}
