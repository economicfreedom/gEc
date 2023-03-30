package Chapter03;

public class Ex3_6 {
	public static void main(String[] args) {
		int[] arr = {88,76,92,68,55,48,82}; 
		int sum =0;
		
		
//		arr.length : 7이니까 index 6까지 반복
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
		}
		System.out.println("총합:"+sum);
	}
}
