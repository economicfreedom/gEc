package Chapter05;

class OuterClass{ //외부 클래스
	private String secret = "Time is money";
	public OuterClass() {//2. 달걀의 생성자 호출됨
		new InnnerClass();//3. 노른자 객체 생성
		InnnerClass obj = new InnnerClass();
		obj.method(); //a.
	}
	class InnnerClass{ //내부(중첩 or inner)클래스
		//	private class InnnerClass{ //내부(중첩 or inner)클래스
		public InnnerClass() {//4. 노른자의 생성자 호출됨
			System.out.println("내부 클래스의 생성자 입니다.");
		}
		//b.
		public void method() {
			//노른자에서 달걀의 private 접근
			//c.
			System.out.println(secret);
		}
	}
}

public class OuterClassTest {
	public static void main(String[] args) {
		//		private 를 안 해도  접근 금지
		//		new InnnerClass();//접근 제한, 노른자 객체 생성(오류)
		//		new OuterClass(); //1.달걀 객체 생성
		OuterClass outer = new OuterClass();
//		outer.secret;//접근 제한, 달걀 private(오류)
		
	}
}
