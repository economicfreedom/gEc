package Chapter02;
public class FloatDoubleExample {
	public static void main(String[] args) {
		
		// 오류 : 실수는 기본타입을 double로 인식하기에 float 랑 double 리터럴이 같지않음
		// float var1 = 3.14;
		
		// 해결 : 리터럴값이 기본 double이 아닌 f(float의 약자) 라고 명시해주기
		float var1 = 3.14f;
		
		// 혹은 실수의 기본 리터럴 타입 더블을 쓰는 방법도있음
		double var2 = 3.14;
		
		// 출력
		System.out.println( "var1: " + var1 );
		System.out.println( "var2: " + var2 );
		
		/* ================================================== */
		
		float var3 = 0.1234567890_1234567890_123456789f;  // 0.123456789 에서 0.12345679 로 8이 빠진이유, 8이 빠진게 아니고 8 다음의 숫자가 반올림된거임.
		float var4 = .9876543210_9876543210_9876543210f; // 더블도 마찬가지 
		System.out.println( "var3: " + var3 );
		System.out.println( "var4: " + var4 );
		
		/* ================================================== */
		
		double var5 =  0.1234567890_1234567890_123456789;
		double var6 =  .9876543210_9876543210_9876543210;
		System.out.println( "var5: " + var5 );
		System.out.println( "var6: " + var6 );
		
		/* ================================================== */
		
		double var7 = 3e6;
		float var8 = 10e3F;
		double var9 = 2e-3;
		
		System.out.println( "var7: " + var7 );
		System.out.println( "var8: " + var8 );
		System.out.println( "var9: " + var9 );
		
	}
}
