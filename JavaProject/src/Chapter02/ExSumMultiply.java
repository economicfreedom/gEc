package Chapter02;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리수 정수 입력(100~999)>>> ");
		int n = sc.nextInt();
//		100자리수: 나누기 100의 몫
//		10 자리수: 나누기 100의 나머지를 10으로 나눈 몫
//		1의 자리수: 나누기 100의 나머지를 10으로 나눈 나머지
		
		int hundred = n/100; //100자리수
		int hundredRest= n%100;
		int ten= hundredRest/10; //10자리수
		int one= hundredRest%10; //1자리수
		
		int sum = hundred+ten;
		int multiply = ten*one;
		 
		System.out.println("100의 자리와 10의 자리의 합은"+sum);
		System.out.println("10의 자리와 1의 자리의 곱은"+multiply);	
	}
}
