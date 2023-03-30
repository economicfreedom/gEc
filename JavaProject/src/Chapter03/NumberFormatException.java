package Chapter03;
/*
 * 문자열을 정수로 변환
 * 변환안될때를 대비해서 예외 처리
 */
public class NumberFormatException {
	public static void main(String[] args) {
		String[] stringNumbers = {"23","12","3.141592","998"};
		/*문자열을 정수로 받을때 오류
		 * int j =stringNumbers[i];
		 * String 변수로 받을 수 있음
		 * int j =stringNumbers[i];
		 * Integer : Wrapper
		 * parseInt : 문자열을 정수로 변환하는 메소드
		 * java.lang.NumberFormatException : For input string : "3.141592"
		 */
		for (int i = 0; i < stringNumbers.length; i++) {
			try {
				int j =Integer.parseInt(stringNumbers[i]); 
				
			} catch (Exception e) {
				System.out.println(stringNumbers[i]+"정수로 변환 할 수 없습니다.");
			}
			
		}
		
		
	}
}
