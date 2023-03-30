package Chapter03;

import java.util.Scanner;

public class ArrayAccess정답 {
	public static void main(String[] args) {
		int max = 0;
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=scan.nextInt();
			if (intArray[i]>max) {
				max=intArray[i];
				
			}
		}
	}
}
