package Chapter02;
public class LongExample {
	public static void main(String[] args) {
		
		// long 타입은 리터럴값 뒤에 L 을 선택적으로 붙일 수 있다
		// Long 타입은 리터럴값 뒤에 L 을 필수적으로 붙여야 한다
		// Why? -> long을 써도 리터럴값은 int로 인식해서 범위가 long이 아님, 그래서 L을 붙여줘야함.
		
		long var1 = 10;
		long var2 = 20L;
		long var3 = 9223372036854775807L; // 리터럴값: 2의 63승 -1값 (양수)
				
		
		System.out.println( var1 );
		System.out.println( var2 );
		System.out.println( var3 );
		
		
	}
}
