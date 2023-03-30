package Chapter04;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[10];
		int min = 0;
		int max = 0;
		
		for(int i = 0; i<intArray.length; i++) {
			intArray[i] = scan.nextInt();
			if (i==0) {
				min = intArray[i];
				
			}
			if (intArray[i]<min) {
				min = intArray[i];
				
			}
			if(intArray[i]>max) {
				max=intArray[i];
			}
			
		}
	}
}
