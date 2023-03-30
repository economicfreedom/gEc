package Chapter03;

import java.util.Scanner;

//초 단위의 정수를 입력받고, 몇시간,몇분,몇초인지 출력하는 프로그램 작성
public class ArithmeticOperator {
public static void main(String[] args) {
	int time;
	int second=0;
	int hour=0;
	int minute=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수를 입력하세요: ");
	time = sc.nextInt();
	
//	ex) 5000 = 5000/3600=1
	hour = time /3600; //시간
	minute = (time/60)%60; //분
	second = time %60; //초

//	hour = time/3600;
//	minute = time%3600/60;
//	second = time%3600%60;
//	
	
	System.out.printf("%d초는 %d시간,%d분,%d초 입니다.",time,hour,minute,second);
}
}
