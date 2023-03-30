import java.util.Scanner;

public class assessment {
	public static void main(String[] args) {
		int radius; //원뿔 밑의 원의 반지름
		int height; //원뿔의 높이
		double volume; //원뿔의 부피

		Scanner scan = new Scanner(System.in);
	
		System.out.print("원뿔 밑의 원의 반지름을 입력하세요: ");
		radius = scan.nextInt();
		
		System.out.print("원뿔의 높이를 입력하세요: ");
		height = scan.nextInt();
		
		double num1 = (double)radius;
		System.out.println("원뿔 밑의 원의 반지름: "+ num1);
		double num2 = (double)height;
		System.out.println("원뿔의 높이: "+ num2);
		volume = num1 * num1 * Math.PI * num2 / 3;
		System.out.println("원뿔의 부피: " + volume);
		
		scan.close();	
	}
}
