package Chapter03;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		int num = 0;
		boolean multiple;
		multiple=false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		num = sc.nextInt();
		
		/*3의 배수(아닌경우(5의 배수 or not(8의 배수 or not)))
		if else if (if else (if else(if else))
		로직이 복잡해진다
		if else if 혹은 if else가 만능은 아니다
		→ if문만 사용
		*/
		
		if(num%3==0) {
			System.out.println("3의 배수이다.");
			multiple = true;
		}
		if(num%5==0) {
			System.out.println("5의 배수이다.");
			multiple = true;
		}
		if(num%8==0) {
			System.out.println("8의 배수이다.");
			multiple = true;
		}
		
		// 3,5,8배수의 조건이 하나도 아닐때
		if(multiple == false) {
			System.out.println("어느 배수도 아니다.");
		}
	}
}
		
		
		
//		if(multiple) {
//			System.out.print("어느 배수도 아니다.");
//		}else {
//			if(num%3==0) 
//				System.out.println("3의 배수이다.");
//			multiple = true;
//			if(num%5==0) 
//				System.out.println("5의 배수이다.");
//			multiple = true;
//			if(num%8==0)
//				System.out.println("8의 배수이다.");
//			multiple=true;
//			if(num%3!=0 && num%5!=0 && num%8!=0) {
//				System.out.println("어느 배수도 아니다.");
//			}
//		}
//	}
//}
		
//
//		if(num%3!=0 && num%5!=0 && num%8!=0) {
//			System.out.println("어느 배수도 아니다.");
//		}else {
//			if(num%3==0) 
//				System.out.println("3의 배수이다.");
//			
//			if(num%5==0) 
//				System.out.println("5의 배수이다.");
//			
//			if(num%8==0)
//				System.out.println("8의 배수이다.");
//			
//			}
//		}
//	}
//		
