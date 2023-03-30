package Chapter03;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=n; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
