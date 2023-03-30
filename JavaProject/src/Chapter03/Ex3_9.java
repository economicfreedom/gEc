package Chapter03;
/*
 * 구구단을 배열로 생성
 * 값을 넣어본다 ex>2*7=14,9*4=36
 */
public class Ex3_9 {
	public static void main(String[] args) {
//		2차원 배열 선언(1차원은 열로구성, 1차원이 2개이상 가지고 행으로 구성)
//		1*1=1 ~9*9=81
//		int[][] gugudan;
		int[][] gugudan = new int[10][10];
//		int[][] gugudan = new int[10][10] 0~9까지;
//		gugudan.length : 9행
//		1~9까지(10보다 작을때 까지)
//		for (int i = 1; i < gugudan.length+1; i++) {

		for (int i = 0; i <9; i++) {//행 기준
			for (int j = 0; j <9; j++) {//열 기준
//				행렬에 1*1~9*9 까지 값을 2차원 배열 원소로 저장
				gugudan[i][j]=i*j;//i:행, j:열(gugudan[i][j])

			}
			
		}	

		System.out.println(gugudan[2][7]);
		
		
		
		
		
		
		
		
	}
}
