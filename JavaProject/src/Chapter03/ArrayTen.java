package Chapter03;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int sum = 0;
		System.out.print("10개의 정수를 입력하세요");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			sum+= a[i];
			
		}
		System.out.println("합계는"+sum);
		
	}
}
