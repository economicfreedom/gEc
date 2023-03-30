package Chapter05;

import java.util.Random;
import java.util.Scanner;

public class 점메추 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("사람 수 입력");
		int num = scan.nextInt();
		System.out.println("먹고 싶은 음식 입력");
		
		
		String[] food = new String[num];
		String choice;
		
		int i=0;
		a:
		for ( i = 0; i < food.length; i++) {
			System.out.print(i+1+". ");
			food[i]=scan.next();
			scan.nextLine();
			if(i+1==num) {
				System.out.print("다시하쉴? (Y/N)" );
				choice=scan.next();
				if(choice.equals("Y")) {
					
					continue a;
				}else {
					break;
				}
			}
		}
		
		System.out.println(food[rand.nextInt(num)]);
		
		
	}
}
