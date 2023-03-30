package Chapter02;
public class PromotionExample {
	public static void main(String[] args) {
		
		/* 
			암묵적형변환이란, 내 의지와 상관없이 자동으로 자료형이 변경되는것.
			
			 
		 */
		
		
		
		// 암묵적 형변환 : 작은 타입  (byte) -> 큰 타입 (int)
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println( "intValue: " + intValue );
		
		
		// 암묵적 형변환 : 작은 타입 (char) -> 큰 타입 (int)
		char charValue = '가';
		intValue = charValue;
		System.out.println( "intValue: " + intValue ); // 유니코드 출력된다 44032
		
		// 암묵적 형변환 : 작은 타입 (int) -> 큰 타입 (long)
		intValue = 50;
		long longValue = intValue;
		System.out.println( "longValue: " + longValue );
		
		// 암묵적 형변환 : 작은 타입 (int) -> 큰 타입 (float)
		longValue = 100;
		float floatValue = longValue;
		System.out.println( "floatValue: " + floatValue );
		
		// 암묵적 형변환 : 작은 타입 (float) -> 큰 타입 (double)
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println( "doubleValue: " + doubleValue );
		
	}
}