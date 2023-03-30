package Chapter03;

public class Ex3_5 {
	public static void main(String[] args) {
//		new int[5] : 배열 생성(크기가 5->인덱스 4까지)
		int[] sales = new int[5];
		
		
//		배열원소를 다른 값으로 저장
		sales[0] = 52; 
		sales[1] = 50; 
		sales[2] = 55; 
		sales[3] = 42; 
		sales[4] = 38; 
//		int 타입 배열은 생성만 했을때 초기값 : 0
//		System.out.println(sales[0]);
		
		int sum = sales[0]+sales[1]+sales[2]+sales[3]+sales[4];
		System.out.println("총 판매량 "+sum);
	}
}
