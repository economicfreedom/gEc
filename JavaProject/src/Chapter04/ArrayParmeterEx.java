package Chapter04;

public class ArrayParmeterEx {
//	공백을 쉼표로 바꾸는 메소드
	static void reaplaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==' ') {
				a[i]=',';
			}
			
		}
		
	}
	//메소드 호출됨
	static void printCharArray(char a[]) {
//		매개변수 크기만큼 반복
//		3. 배열원소 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
			
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
//		1. 메소드 호출
		printCharArray(c);
		reaplaceSpace(c);
		printCharArray(c);
		
		
	}
}
