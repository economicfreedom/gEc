package Chapter05;

import java.util.Random;

public class twoDArray {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[][] rands= new int[4][4];
		
		for (int i = 0; i < rands.length; i++) {
			for (int j = 0; j < rands[i].length; j++) {
				rands[i][j] = rand.nextInt(10)+1;
			
			}
		}
		
		for (int i = 0; i < rands.length; i++) {
			for (int j = 0; j < rands[i].length; j++) {
				System.out.print(rands[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
}
