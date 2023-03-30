package Chapter06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");//append(): 문자열 연결(추가되면서 수정됨)
		System.out.println(sb);
		
//		insert():문자열 삽입
		sb.insert(7, " my");//This is pencil ->is 다음에 my 삽입
		System.out.println(sb);//This is my pencil
		
		//replace(): 문자열 대체
		sb.replace(8,10, "your");//This is my pencil ->my그 your로
		System.out.println(sb);//This is your pencil
		
		
		//인덱스 값으로 삭제
		sb.delete(8,13);//This is your pencil ->your 삭제됨
		System.out.println(sb);//This is pencil
		
		//setlength():문자열 길이 수정
		sb.setLength(4);//This is pencil -> 인덱스 4번 이후부턴 삭제
		System.out.println(sb);
	}
}
