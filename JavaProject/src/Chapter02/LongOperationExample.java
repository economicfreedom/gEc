package Chapter02;
public class LongOperationExample {
	public static void main(String[] args) {
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000;
		
		
		// 연산된 결과에서 가장 큰 타입인 long을  int로 명시적 형변환(다운 캐스팅) 처리
		int result = (int) (value1+value2+value3);
		System.out.println( result );
		
		
		
		
	}
}
