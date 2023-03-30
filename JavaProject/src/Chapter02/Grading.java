package Chapter02;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		
		// char 선언
		char grade;
		
		// 점수를 입력받아서 학점출력
		Scanner scanner = new Scanner(System.in);
		
		// 입력받기
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		
		// 조건문
		if (score >= 90) { 	grade = 'A'; } // 점수가 90 ~ 일때 학점은 A
			
		else if ( score >= 80 ) { grade = 'B';	} // 점수가 90이상은 아닌데, 80 이상일때
		else if ( score >= 70 ) { grade = 'C';	} // 점수가 80이상은 아닌데, 70 이상일때
		else if ( score >= 60 ) { grade = 'D';	} // 점수가 70이상은 아닌데, 60 이상일때
		else  { grade = 'F'; } // 점수가 60점 이상도 안될경우 최후에 실행될 내용
		
		
		// 출력
		System.out.println("학점은 " + grade + "입니다. ");
		
		// 스캐너 종료
		scanner.close();
		
		
		
	}
}
