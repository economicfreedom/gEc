package Chapter02;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>> ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int max = 0;
		int min = 0;
		//최대값구하기
		if(a>b && a>c) {
			max = a;
		}else if (b>a && b>c) {
			max = b;
		}else {
			max=c;
		}
		System.out.println("최대값은"+max);
		
		//최소값 구하기
		if(a<b && a<c) {
			min = a;
		}else if (b<a && b<c) {
			min = b;
		}else {
			min = c;
	}
		System.out.println("최소값은"+ min);

	}
}
