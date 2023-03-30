package Chapter03;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		//상수로 100달러 원화 계산
		final int hundred = 120000;
		final int ten = 12000;
		int res, money, num; //결과, 돈, 가구수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		num = sc.nextInt();
		
		if(num == 1) {
			money = 400000;
		}else if(num ==2) {
			money = 600000;
		}else if(num ==3) {
			money = 800000;
		}else {
			money = 1000000;
		}
		
		res = money/hundred;
		if(res>0) {
			System.out.println("100달러짜리"+res+"매");			
		}
		
		money = money%hundred;
		res = money/ten;
		if(res>0) {
			System.out.println("10달러짜리"+res+"매");			
		}
	}
}

//		int house=0; //가구수
//		int dollar=1200;
//		int money;
//		int res
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("가구수를 입력하시오>>");
//		house = sc.nextInt();
//		
//		// 원->달러로 변환
//		if(house==1) 
//			money = 400000/dollar;
//		if(house==2) 
//			money = 600000/dollar;
//		if(house==3) 
//			money = 800000/dollar;
//		if(house==4) 
//			money = 1000000/dollar;
//		
//		res = money/100; //100달러
//		System.out.println("100달러짜리 "+x+"매");
//		
//		money = dollar%100;
//		money = money/100;
//		System.out.println("10달러짜리 "+money+"매");
//		
//		
//		sc.close();