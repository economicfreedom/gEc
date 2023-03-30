package Chapter05;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원금을 입력하세요");
		int principal =scan.nextInt();
		System.out.println("연이율을 입력하세요");
		double rate = scan.nextDouble();
		
		double balance = principal;
		
		
		
		
		
		System.out.println("연도수\t원리금");
//		while(balance<=principal*2) {
//			balance = balance*(1.0+rate/100.0);
//			System.out.println(years+"\t"+balance);
//			years++;
//		}
//	
		for(int years=1; balance<=principal*2; years++) {
			balance = balance*(1.0+rate/100.0);
			System.out.println(years+"\t"+balance);
		}
	}
}
