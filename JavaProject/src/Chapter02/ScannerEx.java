package Chapter02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		
		// 안내메시지 출력
		System.out.println
		( 
		"아래 내용을 공백단위로 구분하여 입력해주세요 \n" + 
		"이름(Str) \t 도시(Str) \t 나이(int) \t 체중(double) \t 솔로여부(T/F)"
		);
			
		// 입력받기
		System.out.print("이곳에 입력: ");
		Scanner stdIn = new Scanner(System.in);
		
				
		// 받은내용
		String name = stdIn.next();
		String city = stdIn.next();
		int age = stdIn.nextInt();
		double kg = stdIn.nextDouble();
		boolean solo = stdIn.nextBoolean();
		
		// 입력결과 출력
		System.out.println(" Result ----------> ");
		System.out.println("name: " + name);
		System.out.println("city: " + city);
		System.out.println("age: " + age);
		System.out.println("kg: " + kg);
		System.out.println("solo: " + solo);
		
		// 종료
		stdIn.close();
		


		
	}
}
