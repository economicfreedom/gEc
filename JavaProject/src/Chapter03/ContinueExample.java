package Chapter03;

import java.util.Scanner;

//5개의 정수를 입력 받고 그 중 양수들만 합하여 출력하는 프로그램
public class ContinueExample {
	public static void main(String[] args) {
		 int n=0;
		 int sum=0;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수를 5개 입력하세요.");
		 
		 for(int i =0; i<5; i++) {
			 n= sc.nextInt();
		 
//		 	음수일때
			 if(n<=0) {
//			 i++증감쪽으로 이동
			 continue;
			 } else {
			 sum+= n;
			 }
		 }
		 System.out.print("양수의 합은"+sum);
		 sc.close();
	}
}
////		 양수일때
//		 if(n>0) {
////			 sum에 합계를 누적
//			 sum+= n;
//		 }
//		 System.out.print("양수의 합은"+sum);
//		 sc.close();
//	}
//}
//
//		int sum=0;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 5개 입력하세요. ");
//					
//		for(int i=0; i<5; i++) {
//			int num = sc.nextInt();	
//			if(num>0) {
//				sum+=num;
//				continue;
//			}
//		}
//		System.out.println("양수의 합은 "+sum);
//	}
//}
