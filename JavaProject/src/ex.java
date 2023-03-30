import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex {
	public static void main(String[] args) {
			
		// 자바 8 이전의 사용방법
		// StreamTest.BeforeJava8();
		
		// 리스트 + 자바8부터 지원되는 람다(익명함수) 활용
		// StreamTest.AfterJava8List();
		
		// 배열 + 자바8부터 지원되는 람다(익명함수) 활용
		StreamTest.AfterJava8Array();
		
		// 끝으로,  직접만든 ` MyRepository ` 클래스를 활용한 에시
		// MyRepository 클래스 맴버변수 String name, int age 2개 있음
		// MyRepository 클래스 구성 - 클래스 맴버변수를 모두 받는 생성자와,  게터 세터로 구성되어있음
		
		
		
	}	
}



class StreamTest {
	
	 //  ============================================================================ 
	
	 // 자바 8 이전에는, 이런 방식으로 사용했었다 (과거형) ▼
	 
	 //	 ============================================================================ 
	static void BeforeJava8() {
		/* TODO 스트림의 기본 */
		
		// 리스트 초기화  seasonList,  Arrays.asList 메소드를 이용해서 [봄, 여름, 가을, 겨울] 넣어줌
		ArrayList<String> seasonList = new ArrayList<String>( Arrays.asList("봄", "여름", "가을", "겨울")  );
		
		// seasonList의 iterator() 메소드를 사용
		Iterator<String> iterator = seasonList.iterator();
		
		
		// 초기화된 seasonList의 목록을 받아서, 초콜릿처럼 꺼내먹는  .hasNext() 메소드
		while (iterator.hasNext()) {
			// iterator의 값이 존재할때마다  존재한 인덱스 값을 string 변수로 넘겨줌
			String string = (String) iterator.next();
			// string 변수로 받아온 내용을  출력함
			System.out.println( string );
		}
	}
		
	 //  ============================================================================ 

	 // 자바 8부터는,  람다(익명함수)를 사용할 수 있다.  ` 리스트 ` 를 활용한 예시 ▼
	 
	 //	 ============================================================================ 
			
		 static void AfterJava8List() {
			
			 // seasonList 배열리스트 생성
			 ArrayList<String> seasonList = new ArrayList<String>(
					Arrays.asList("자바8부터는", "람다식을 이용할 수 있다", "이렇게")
					);
			
			// 생성된 리스트를 스트림에 넣어주고
			Stream<String> stream = seasonList.stream();
			
			// 넣었던 정보를 .forEach() 메소드를 통해 사용
			stream.forEach(
					// 람다식  
					getIndex -> System.out.println("문자열 하나씩 꺼내오기 -> " + getIndex ) 
					);
		}
		 
		 
		 //  ============================================================================ 

		 // 리스트 대신,  배열을 활용해본 예시 ▼
		 
		 //	 ============================================================================ 
		 
		 static void AfterJava8Array() {
			 String[] strArray = { "월", "화", "수", "목", "금", "토", "일" };
			 Stream<String> strStream = Arrays.stream( strArray );
			 strStream.forEach(
					 	getText -> System.out.println("요일: " + getText)
					 );
			 
			 System.out.println("");
			 int[] intArray = { 1, 2, 3, 4, 5 };
			 IntStream intStream = Arrays.stream( intArray );
			 intStream.forEach( 
					 getInt -> System.out.println( "숫자출력: " + getInt )
					 );
			 
		 }
		 
		 //  ============================================================================ 

		 // 마지막으로,  ` MyRepository ` 클래스를 활용해본 예시 ▼
		 
		 //	 ============================================================================
		 
		 static void AfterJava8Class() {
			 
		 }
		 
}
		




// StreamTest.AfterJava8Class() 메소드에서 사용하기위한 클래스 ▼
class MyRepository {

	// ClassField
	private String name;
	private int age;
	
	// All Args Constructor	
	public MyRepository(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

