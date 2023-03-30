package ChapterPractice;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오 >>");
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();
		int l3 = sc.nextInt();
			
		if (l1+l2>=l3||l1+l3>=l2||l2+l3>=l1) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 안됩니다.");
				
		}
	}
}

