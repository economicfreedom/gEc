package Chapter02;
public class VariableUseExample {
/*
	About -->
		작성일: 2023 02 21
		작성자: 민우
		내용	: 

	
 */
	public static void main(String[] args) {
		
		int hour = 3;
		int miute = 5;
		System.out.println( hour + "시 " + miute + "분" );
		
		int result = (hour*60) + miute;
		System.out.println( "토탈 " + result + "분 입니다." );
		
	}
}
