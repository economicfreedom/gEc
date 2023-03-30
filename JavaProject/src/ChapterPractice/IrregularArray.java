package ChapterPractice;

import Chapter03.forTest;

public class IrregularArray {
	public static void main(String[] args) {
		int n[][] = {{10,11,12},{20,21},{30,31,32},{40,41}};
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
