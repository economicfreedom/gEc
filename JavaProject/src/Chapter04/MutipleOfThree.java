package Chapter04;

import java.util.Scanner;

public class MutipleOfThree {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int[] a=new int[10];
		
		System.out.print("양의 정수 10개를 입력하시오>> ");
		for (int i = 0; i < a.length; i++) {
			a[i]= scan.nextInt();
			
		
			
		}
		System.out.print("3의 배수는");
		for (int i = 0; i < a.length; i++) {
			
		if(a[i]%3==0) {
			System.out.print(" "+a[i]);
		}
		}
	}
}
