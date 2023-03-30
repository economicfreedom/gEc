package Chapter03;

import java.util.Scanner;

public class ArrayMin정답 {
	public static void main(String[] args) {
//		1.첫번째 방법
//		int min = Integer.MAX_VALUE;//int 타입의 가장 큰 숫자
		int min = 0;
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[7];
		System.out.println("양수 7개를 입력하세요");
		
		for (int i = 0; i < intArray.length; i++) {

			intArray[i] = scan.nextInt();
//			2. 두 번째 방법
//			첫번째 반복할때 무조건 배열원소를 min에 저장
			if(i==0) {
				min = intArray[i];
			}else {
				if(intArray[i]<min) {
					min = intArray[i];
				
			}
			
			}
			
		}
	}
}
