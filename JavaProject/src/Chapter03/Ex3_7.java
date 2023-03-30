package Chapter03;

public class Ex3_7 {
	public static void main(String[] args) {
		int[] evens = {0,2,4,6,8,10,12,14,16,18};
		int[] primes = {2,3,5,7,11,13,17,19};
		
//		1. 짝수배열을 메소드 매개변수로 호출
//		5. 합계를 받아서 evenSum에 저장
		int evensSum =sum(evens);
		int primesSum=sum(primes);
		System.out.println(evensSum);
		System.out.println(primesSum);
	}
	public static int sum(int[] arr) {
		int sum =0 ;
//		매개변수 배열의 크기만큼 반복하면서 sum에 합계 누적
//		3.arr 배열원소를 가지고 반복(0,2,4,6,8,10,12,14,16,18)해서 합계 구함
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
//		4.합계를 반환
		}
		return sum;
	}
}
