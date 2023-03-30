package Chapter03;
/*
 * 예외처리
 * 배열 인덱스 벗어나는 것
 * 
 */

public class ArrayException {
	public static void main(String[] args) {
		int[] intArray=new int[5];
		intArray[0] = 0;
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
//		at Programmers.ArrayException.main(ArrayException.java:14)
//		인덱스 범위를 벗어남
		try {
			
			for (int i = 0; i < intArray.length; i++) {
				intArray[i+1]=intArray[i]+i+i;
				System.out.println(intArray[i]);
			}
			} catch (Exception ArrayIndexOutOfBoundsException) {
				System.out.println("배열의 인덱스가 범위를 벗어났습니다");
		}
		
		
		
	}
}
