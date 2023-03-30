package Chapter02;
public class VariableExchangeExample {
/*
	About -->
		작성일: 2023 02 21
		작성자: 민우
		내용	: 

	
 */
	public static void main(String[] args) {
		
		
		int x = 3;
		int y = 5;
		System.out.println("[x: " + x + " y : " + y + "]");
		
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("[x: " + x + " y : " + y + "]");
				
		
		
	}
}
