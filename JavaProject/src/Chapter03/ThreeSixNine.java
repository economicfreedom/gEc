package Chapter03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
//		count : 3,6,9 갯수
//		num : 입력받는 정수
//		a : 10의자리
//		b : 1의자리
		int count=0,num,a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>> ");
		num = sc.nextInt();
		
		a = num/10; //10의자리
		b = num%10; //1의 자리
		
		//10의 자리 3,6,9일때
		if(a%3==0) {
			//카운트 증가
			count++;
		}
		//1의 자리 3,6,9 일때
		//30,40,50...
		if(b%3==0 && b!=0) {
			//카운트 증가
			count++;
		}
		
		if(count ==2) {
			System.out.println("박수짝짝");
		}else if(count ==1) {
			System.out.println("박수짝");
		}else {
			System.out.println("박수없음");
		}
	}
}
		