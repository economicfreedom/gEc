package Chapter02;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	
//		System.out.println("*.");
//		
//		System.out.print("정수 를 입력하시오>>");
//		int l1 = sc.nextInt();
//		int l2 = sc.nextInt();
//		int l3 = sc.nextInt();
//		
//		//마지막 숫자가 0이면 삼각형의 넓이
//		if (l3==0) {
//			float triangle = (l1*l2)/2;
//			System.out.println("삼각형의 넓이는"+triangle);
//		//마지막 숫자가 0이 아니면 사다리꼴의 넓이
//		} else {
//			float trapezium = (l1+l2)*l3/2;
//			System.out.println("사다리꼴의 넓이는"+trapezium);
//		}
//		sc.close();
//	}
//}
//		
		System.out.print("정수 를 입력하시오>>");
		double t = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		
		double tArea = (double)(b*h/2);  //삼각형 넓이 공식 : 밑변*높이/2
		double sArea = ((t+b)*h)/2; // 사다리꼴 넓이 공식: (윗변+아랫변)*높이/2
		
		if(h==0) {
			System.out.println("삼각형의 넓이는 "+ tArea);
		}else {
			System.out.println("사다리꼴의 넓이는"+sArea);
		}
		sc.close();
	}
	
}
