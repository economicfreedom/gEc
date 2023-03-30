package Chapter03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		int tesla = 520;
		int num; //수량
		int money; //tesla * num
		int res;; //계산된 결과 값
		
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		num = sc.nextInt();
		money = tesla * num;
		
//		money를 가지고 100달러, 10달러 계산해야 함
		res = money/100;
		
//		100달러짜리가 1매 이상일때
		if(res > 0) {
			System.out.println("100달러짜리"+res+"매");
		}
		
//		10달러짜리 계산
		money = money%100; //나머지 돈을 다시 셋팅
		res = money/100;
		if(res > 0) {
			System.out.println("10달러짜리"+res+"매");
		}
		
		sc.close();
	
	
	
	}
}

//int stock=0; //매수수량
//int hundred = 0;
//int one = 0;
//
//System.out.print("매수 수량을 입력하시오>> ");
//
//hundred = (stock*520)/100;
//System.out.println("100달러짜리 "+hundred+"매");
//one = (stock*520)%100/10;
//System.out.println("10달러짜리"+one+"매");	