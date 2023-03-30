package Chapter03;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>> ");
		num = sc.nextInt();
		
//		구구단 -> 2중 for문 (행과 열 출력)
//		* 갯수를 행과 열로 출력 -> 2중 for문 사용
		
//		for(int i=0; i<=num; i++) {
//			for(int j=0; j<num; j++) {
		
		//감소시키는 로직을 위해서 역으로 진행
		for(int i=num; i>0; i--) {
			//하나씩 줄이기 위해 i값 사용
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
//			5개 출력 후 엔터 필요
			System.out.println();
		}	
	}
}
