package Chapter02;
public class CharExample {
	public static void main(String[] args) {
	
		// 단일 문자
		char c1 = 'A';
		System.out.println( c1 );
		
		// 유니코드 ( 아스키코드 )
		char c2 = 65;
		System.out.println( c2 );
		
		
		//  \\u~ 16진수라는 뜻
		char c3 ='\u0041';
		System.out.println(c3);
		
		
		// 한글 단일문자
		char c4 = '가';
		System.out.println( c4 );
		
		// 한글 유니코드
		char c5 = 44032;
		System.out.println( c5 );
		
		// ac00 16진수는 44032 10진수임
		char c6 = '\uac00' ;
		System.out.println( c6 );
		
	}
}
