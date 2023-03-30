package Chapter02;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int median=0; //중간값도 변수 선언과 초기화 시켜줌
		
//		(a>b && a<c) : a가 b보다 크고, c보다 작다
//		|| (or)
//		(a>c && a<b : a가 c보다 크고, b보다 작다
		if ((a>b && a<c) ||  (a>c && a<b) ) {
			median = a;
		} else if ((b>a && b<c) ||  (b>c && b<a)){
			median = b;
		} else {
			median = c;
		}
		System.out.println("중간 값은"+ median);
		sc.close();
	}
}
