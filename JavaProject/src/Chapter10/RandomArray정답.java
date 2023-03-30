package Chapter10;

import java.util.Random;
import java.util.Scanner;

public class RandomArray정답 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 몇개?");
		int num = scan.nextInt();
		Random randomArray = new Random();
		int[] arr = new int[num];
		int rand ;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=randomArray.nextInt(100)+1;
		}
		for (int i = 1; i < arr.length+1; i++) {
			System.out.print(arr[i-1]+" ");
			if (i%10==0) {
				System.out.println();
				
			}
		}
	}
}
