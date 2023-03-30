package Chapter03;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오>> ");
		int money = scan.nextInt();
		
		int 오만 = money/50000;
		int 만원 = money%50000/10000;
		int 천원 = money%10000/1000;
		int 백원 = money%1000/100;
		int 오십 = money%100/50;
		int 십원 = money%100%50/10;
		int 일원 = money%10/1;
		
		System.out.println("오만원권  "+오만+"매");
		System.out.println("만원권  "+만원+"매");
		System.out.println("천원권  "+천원+"매");
		System.out.println("백원"+백원+"개");
		System.out.println("오십원  "+오십+"개");
		System.out.println("십원  "+십원+"개");
		System.out.println("일원  "+일원+"개");
	}
}
