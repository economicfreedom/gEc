package Chapter04;

import java.util.Random;



public class RandomTen {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] a = new int[10];
		double sum = 0;
		System.out.print("랜덤한 정수들:");
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(10)+1;
			System.out.print(" "+a[i]);
			sum+=a[i];
		}
		System.out.println();
		System.out.println("평균은"+sum/a.length);
		
	}
}
