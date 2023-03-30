package Chapter02;
public class EscapeExample {
	public static void main(String[] args) {
		
		// println : 줄바꿈 가능
		System.out.println 
		(	"번호 \t 이름 \t 직업"	);
		
		// print : 줄바꿈 불가, 필요시 \n 을 사용하면 가능
		System.out.print 
		(	"번호 \t 이름 \t 직업"	);
		System.out.print 
		(	"번호 \t 이름 \t 직업"	);
		
		
		// print 줄바꿈 사용하기, \n
		System.out.print 
		(	"\n" + "번호 \t 이름 \t 직업 " + "\n"	);
		System.out.print 
		(	"번호 \t 이름 \t 직업 " + "\n"	);
		
		
		// 백슬래시 활용 , 따움표 표시
		System.out.println 
		(	"우리는 \"개발자\"입니다. "	);

		// 백슬래시 활용, 백슬래시 표시
		System.out.println 
		(	"봄 \\ 여름 \\ 가을 \\ 겨울"	);
		
	}
}
