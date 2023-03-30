package Chapter07;

//대문자 알파벳 T을 타입파라미터로 받은 제네릭
public class Box2 <T>{//T가 String이 됨, Integer
	//T가 String이 됨
	
	private T t;//타입파라미터를 t의 타입으로 사용
	//3. 잠와 죽어요
	//타입파라미터를 메소드의 리턴타읍으로 사용
	//T가 String이 됨, Integer
	public T get() {
		return t;
	}
	//타입파라미터를 메소드의 매개변수 타입으로 사용 
	//T가 String이 됨, Integer
	
	public void set(T t) {//1.잠와 죽어요
		this.t=t; //2.잠와 죽어요
	}
}
