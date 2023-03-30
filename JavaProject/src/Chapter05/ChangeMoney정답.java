package Chapter05;

import java.util.Scanner;

public class ChangeMoney정답 {
	public static void main(String[] args) {

		int[] unit = {50000,10000,1000,500,100,50,10,1};
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오>> ");
		int money = scan.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			int res =money/unit[i];
		}
	}
}
