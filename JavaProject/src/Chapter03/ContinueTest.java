package Chapter03;
/*
 * 문자열에서 특정 문자를 찾는다.
 * 찾은 갯수를 출력
 * ex>life is cool. (l->2개)
 */
public class ContinueTest {
	public static void main(String[] args) {
		int count=0; //갯수를 담을 변수 선언 및 초기화
//		알파벳 n의 갯수 구하기
//		no news in good news 문자열의 갯수를 반복시키면서 찾기
//		문자열의 갯수는 어떻게 찾을까? => s.length() 리턴타입 문자열에서 사용할 수 있는 메소드
		String s = "no news in good news"; // 찾는 대상(문자열)
//		length() : 문자열의 크기를 구하는 메소드, 공백까지 포함함
//		스페이스 포함해서 20자
//		System.out.println(s.length());
		
		for (int i = 0; i < s.length(); i++) { //문자열 크기 20번 반복!
//			처음에 s.charAt(0)에 0을 넣으면 n만 출력되는것을 볼 수 이ㅆ다.
//			for문에서 i=0일때
//			System.out.println(s.charAt(0));
//			System.out.println(s.charAt(i));
			
//			알파벳 n이 아니면 스킵
			if(s.charAt(i) != 'n') {
				continue;
			}
//			알파벳 n이면 카운트 증가
			count++;
		}
		System.out.println("문장에서 발견된 n의 갯수: "+count);
	}
}
