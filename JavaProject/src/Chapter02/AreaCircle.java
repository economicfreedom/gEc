package Chapter02;
import java.util.Scanner;
public class AreaCircle {
	
	
	public static void main(String[] args) {

		// 안내
		System.out.println( " 반지름을 입력하세요 >> ");

		// 입력
		Scanner scanner = new Scanner(System.in);
		int radius = scanner.nextInt();
		
		// 계산
		double circleArea = 3.14 * radius * radius;
		
		// 결과
		System.out.println( "원의 면적은 " + circleArea + "입니다. ");
		
		// 종료
		scanner.close();
		
		
	}
} 
