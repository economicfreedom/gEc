package Chapter03;

public class Date1 {


	public static void main(String[] args) {
		int[]numbers = null;
		int sum =0;
		double answer=0;
		
		for(int i=0; i<=numbers.length; i++) {
			sum += numbers[i];
		}
		answer = sum/numbers.length;
		System.out.print(answer);
	}	
}		
