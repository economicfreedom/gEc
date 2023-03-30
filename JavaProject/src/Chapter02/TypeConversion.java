package Chapter02;
public class TypeConversion {
	public static void main(String[] args) {
		
		byte b = 127;
		int i = 100;
		
		// 자동으로 int 타입으로 형변환이 된다. (큰 타입으로)
		System.out.println( b + i );
		
		// 정수와 정수 연산은 = 정수 ( 동일한건 동일하게 )
		System.out.println( 10/4 );
		
		// 정수와 실수 연산은 = 실수 ( 서로 다르면, 그중 더 큰 타입으로 자동 형변환 )
		System.out.println(10.0/4);
		
		// 실수 + 실수는 = 실수
		System.out.println(2.9+1.8);
		
		// 2.9 가 2로 명시적 형변환 당해서 2 + 1.8 = 3.8 이 나옴
		System.out.println((int)2.9+1.8);
		
		// 둘다 명시적 형변환해서 2 + 1 이된다. 따라서 결과는 3이 나온다.
		System.out.println((int)2.9+(int)1.8);
		
		// 2.9 + 1.8 = 4.7 값을 int 명시적 형변환해서, 4가 되었다.
		System.out.println(  (int)(2.9+1.8)  );
		
		
		
	}
}
