package Chapter06;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
	
		StringTokenizer str = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		
		int j = str.countTokens();
		for (int i = 0; i <  j; i++) {
			System.out.println(str.nextToken());
			
		}
		
		
	}
}
