package Chapter03;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[5];
		int max = 0;
		System.out.print("양수 5개를 입력하세요.");
		for (int i = 0; i < array.length; i++) {
			array[i]=scan.nextInt();
			if (array[i]>max) {
				max=array[i];
				
			}
		}
		System.out.println("최대값은 : "+max);
		scan.close();
	}
}
