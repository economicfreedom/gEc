package ChapterPractice;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
//		100 자리수 : 나누기 100의 몫
//		10 자리수: 100의 나머지를 10으로 나눈 몫
//		1 자리수: 나누기 100의 나머지를 10으로 나눈 나머지
	System.out.print("3자리수 정수 입력(100~999)>>");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int h = n/100;
	int hR = n%100;
	int t = hR/10;
	int o = hR%10;
	
	System.out.println("100의 자리와 10의 자리의 합은"+(h+t));
	System.out.println("10의 자리와 1의 자리의 곱은"+(t*o));
	
	sc.close();
	}
}
