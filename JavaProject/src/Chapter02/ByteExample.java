package Chapter02;
public class ByteExample {
	public static void main(String[] args) {
		
		// 오류 --> 범위 초과
		// byte var1 = -129;
		
		// 정상
		byte var1 = -128;
		System.out.println( var1 );
		
		// 여러개 ..
		byte varArray[] = { -38, 0, 120 };
		for (int i=0; i < varArray.length; i++) 
		{ System.out.println( varArray[i] ); }
		
		
		
		
	}
}
