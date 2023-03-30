package Chapter03;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("코스피 지수를 입력하세요(1800~2500): ");
		int kospi = sc.nextInt();
		System.out.print("환율을 입력하세요(1800~2500): ");
		int rate = sc.nextInt();
		
		//코스피로 할지 환율로 할지 먼저 정함
		if (rate<1150) {
			if(kospi>=2300) {
				System.out.println("상승장");
			}else if(kospi>=2000) {
				System.out.println("횡보장");
			}else {
				System.out.println("하락장");
			}
			
		} else {
			if(kospi>=2200) {
				System.out.println("상승장");
			}else if(kospi>=2000) {
				System.out.println("횡보장");
			}else {
				System.out.println("하락장");
			}

		}
	}
}
