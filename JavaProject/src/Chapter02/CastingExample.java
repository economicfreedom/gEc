package Chapter02;
public class CastingExample {
	public static void main(String[] args) {
		
		
		// 명시적 형변환 사례		
		int intValue = 44032;
		// 오류 char charValue = intValue  
		char charValue = (char) intValue;
		System.out.println( charValue ); // 유니코드 44032 == '가'
		
		
		// (자료형) 형변환해야될 변수이름
//		long longValue = 500;
//		long longValue = 5000999888; //오류나는 이유, 리터럴 값이 long이 되기전 상태라 기본 인트타입임. 그래서 인트 범위초과로 오류
		long longValue = 5000999888L; // 그래서 리터럴값이 L 타입이다 알려줘야함. ( 실수사용할때 뒤에 f 혹은 l 을 붙여야하는 이유 )
		
		
		// long 타입 숫자가 int로 변환될때 잘려서 706032592 로 저장
		intValue = (int) longValue;
		System.out.println( intValue );
		
		
		// 3.14에서 소수점이 잘려서 3으로 나옴
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println( intValue );
		
		
	}
}
