package Chapter03;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		int num1;
		int num2;
		String operator;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산>>");		
		num1= sc.nextInt();
		operator = sc.next(); //연산자는 String타입, 값을 입력받을때 띄어쓰기와 순서에 주의! 연산자 이므로 중간에 위치
		num2= sc.nextInt();
		result = 0;
		
		if(operator.equals("+")) {
			result = num1+num2;
		} else if(operator.equals("-")) {
			result = num1-num2;
		} else if(operator.equals("*")) {
			result = num1*num2;
		} else if(operator.equals("/")) {
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				//프로그램 종료
				return;
//				break 는 반복문에서 사용!(if문이기때문에 오류가 남!)
//				break;
			}else {
				result = num1/num2; 
			}
		} else {
			System.out.println("사칙연산이 아닙니다.");
		}
			System.out.println(num1+operator+num2+"의 계산 결과는 "+result);
	}
}
		
//		if(operator.equals("+")) {
//			System.out.println(num1+"+"+num2+"의 계산 결과는 "+(num1+num2));
//		}else if(operator.equals("-")) {
//			System.out.println(num1+"-"+num2+"의 계산 결과는 "+(num1-num2));
//		}else if(operator.equals("x")) {
//			System.out.println(num1+"x"+num2+"의 계산 결과는 "+(num1*num2));
//		}else {
//			System.out.println(num1+"-"+num2+"의 계산 결과는 "+(num1/num2));
//		}
//	}
//}
