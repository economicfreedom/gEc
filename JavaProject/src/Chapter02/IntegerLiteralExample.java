package Chapter02;
public class IntegerLiteralExample {
	public static void main(String[] args) {
		
		// 2진수 [ 0b 다음에 숫자*진수^역인덱스번호 ]
		// 0b ~ 로 시작
		// 1*2^3 + 0*2의 2승 + 1*2의 1승 + 1*2의 0승 = 11 
		int var1 = 0b1011; 
		System.out.println( var1 );
		
		
		// 8진수 [ 2진수 계산하는방법이랑 같은 식, 다만 진수가 바뀜으로 곱하는 수만 바뀜 ]
		// 0 ~ 로 시작
		// 2*8의 2승  +  0*8의 1승 + 6*8의 0승  
		int var2 = 0206; 
		System.out.println( var2 );
		
		
		// 10진수
		// 그냥 우리가 쓰는거
		int var3 = 365;
		System.out.println( var3 );
		
		
		// 16진수
		// 0x 로 시작
		// 숫자 0~9 , 10부터는 A 로 넘어감 (예시 A는 10, B는 11, C는 12 .. F까지있고 15 끝 !)
		
		int var4 = 0xB3; // 0x~ 16진수(x16),  B(11)*16진수^1승 + 3*16진수^0승 = 179
		System.out.println( var4 );
		
	}
}
