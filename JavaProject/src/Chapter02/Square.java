package Chapter02;
public class Square {
	
	// void라는 리턴타입은  리턴할 것이 없다는 뜻
	public static void main(String[] args) {
			
		int n = 4;
		int s = square(n);
		System.out.println( "한 변의 길이가 " + n + "인 정사각형의 넓이 : " +  s );
			
		
		// return;  void 타입의 메소드니까,  리턴을 안해줘도 된다.	
	}
	
	// 메소드 추가 : square(int타입의 매개변수) 
	public static int square(int length) {

		// 리턴타입이 void가 아닐경우  return을 꼭! 꼭! 해줘야된다.
		return length * length;
	}
}
