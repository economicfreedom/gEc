package Chapter03;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int [5];
		double avg = 0;
		System.out.println("5개의 정수를 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
			avg+=arr[i];
		}
		avg /=5;
		System.out.println("평균은"+avg);
		scan.close();
	}
	
}
