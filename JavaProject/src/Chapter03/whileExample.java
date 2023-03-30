package Chapter03;

import java.util.Scanner;

/*
 * 정수를 입력받음
 * 입력받은 갯수와 평균 출력
 * 마지막에 -1을 입력 중단
 */
public class whileExample {
	public static void main(String[] args) {
		int count=0; //갯수를 저장할 변수 및 초기화
		int sum=0; //합계를 저장할 변수 선언 및 초기화
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = sc.nextInt(); //입력받은 값을 변수에 저장
		
		//n이 -1이 아닐때까지 반복
		while(n != -1) { //-1이 되면 입력이 중단되므로 -1이 아닐때 까지 반복한다.
			sum += n; //입력 받은 값을 sum에 누적
			count++; //입력받은게 몇개인지 count를 증가 시킴
			n = sc.nextInt(); //-1이 아닐때까지 다시 입력 받음
		}
		
		if (count == 0) { //입력된 수가 없음
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.println("정수의 갯수는"+count+"개");
			System.out.println("평균은"+(double)sum/count+"입니다.");
		}
		sc.close();
	}
}
