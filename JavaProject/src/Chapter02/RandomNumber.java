package Chapter02;
public class RandomNumber {
	public static void main(String[] args) {
		
			int n = rollDie();
			// String str = Integer.toString(rollDie());
			System.out.println( n );
			// System.out.println( str );
		
		
	}
	// 매개변수가 없는 메소드 ( 주사위 숫자 구하기 1 ~ 6 )
	public static int rollDie() {
		// random() : 0이상 1미만 난수 발생
		// 6 * Math.random() : 0이상 6미만 난수 발생
		double x = 6 * Math.random();
		int temp = (int)x; // 0~5의 난수
		return temp + 1;
		
	}
	
}
