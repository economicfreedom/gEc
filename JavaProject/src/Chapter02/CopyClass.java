package Chapter02;
public class CopyClass {
/*
	About -->
		작성일: 2023 02 21
		작성자: 민우
		내용	: 

	
 */

	public static void main(String[] args) {
		
		// String 타입의 변수 선언 (☞ﾟヮﾟ)☞
		// String origin;
		
		
		// 변수의 초기값 설정 (초기화)
		String origin = "가나다라";
		String copy = "origin";		
		
		// 출력
		System.out.println( origin );
		System.out.println( copy );
		
		// 복사
		copy = copy + "마바사";
		System.out.println( copy );
		
		
	}
}
