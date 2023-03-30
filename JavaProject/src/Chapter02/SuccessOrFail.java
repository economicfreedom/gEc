package Chapter02;
import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {	
		
		// 점수를 입력받아, 80점 이상이면 합격		
		Scanner scanner = new Scanner(System.in);
		
		// 입력받기
		System.out.print("점수를 입력하시요: ");
		int score = scanner.nextInt();
		
		// 만약 입력받은 score 변수가 80 이상이라면
		if (score >= 80) { System.out.println("합격 !"); }
		
		// 스캐너 종료
		scanner.close();
		
		
	}
}
