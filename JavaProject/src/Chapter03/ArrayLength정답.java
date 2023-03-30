package Chapter03;

import java.util.Scanner;

public class ArrayLength정답 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;
		System.out.println(intArray.length+"개의 정수 입력");
	for (int i = 0; i < intArray.length; i++) {
		intArray[i]=scan.nextInt();
	}
	for (int i = 0; i < intArray.length; i++) {
		sum+=intArray[i];
	}
	System.out.println("평균은"+(double)sum/intArray.length);
	scan.close();
	}
}
