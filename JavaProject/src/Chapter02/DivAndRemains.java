package Chapter02;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>> ");
		int n= sc.nextInt();
		
//		10의 자리 : 나누기 10을 해서 몫
//		1의 자리: 나누기 10을 해서 나머지
		
		int ten = n/10;
		int one = n%10;
		
		if(ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		sc.close();
		
//		if(n%11==0} // 십의 자리와 일의 자리가 같다면 11의 배수가 된다.
		 							// 때문에 11로 나눈 나머지가 0일때를 비교하여 출력한다.
//			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
//		} else {
//			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
//		}
//		sc.close();
	}
}
