package Chapter02;

import java.util.Scanner;

public class SeasonExlf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>> ");
		int month = sc.nextInt();
		
		if (month>=3 && month<=5) {
			System.out.println("봄");
		} else if (month >=6 && month<=8){ 
			System.out.println("여름");
		} else if (month >=9 && month<=11){ 
			System.out.println("가을");
			//12,1~2는 범위 지정이 어려우므로 ||(or)를 사용
		} else if (month ==12 || month<=2 ){ 
			System.out.println("겨울");
		}else {
			System.out.println("잘못입력");
		}
		sc.close();
	}
}
