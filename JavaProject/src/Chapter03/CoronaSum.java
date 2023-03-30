package Chapter03;



public class CoronaSum {
	public static void main(String[] args) {

		int[][] corona = new int [12][3];
		int s = 0;
		for (int i = 0; i < corona.length; i++) {
			System.out.println();
			for (int j = 0; j < corona[i].length; j++) {

				corona[i][j] = (i+1)*10+j+1;
				System.out.print(corona[i][j]+" ");
				s += corona[i][j];
			}
			
		}
		System.out.println();
		System.out.println("1년 전체 코로나 환자수는 "+s);
	}
}
