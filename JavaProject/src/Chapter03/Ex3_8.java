package Chapter03;
/*
 * 문자열에서 r 알파벳 갯수 구하기
 * 알파벳 대/소문자 상관없음
 * toCharrArray() 메소드 이용
 * 
 */
public class Ex3_8 {
	public static void main(String[] args) {
		int count = 0;
		String str = "Programming is fun! Right?";
//		str.toCharArray() : 문자열에서 문자 하나씩 가지고옴 (P~?)
		char[] charArr=str.toCharArray();
		
//		Programming is fun! Right?
		for (int i = 0; i < charArr.length; i++) {
			if(charArr[i] == 'R'||charArr[i] =='r') {
				count++;
			}
		}
		System.out.println(str);
		System.out.println("=>R(r)의 갯수 : "+count);
	}
}
