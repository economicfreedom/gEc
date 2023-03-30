package Chapter03;

import java.util.Scanner;

public class ReturnArray2 {
	static int[] makeArray(int[] n) {
		
		for (int i = 0; i < n.length; i++) {
			n[i]+=100;
			System.out.print(n[i]+" ");
		}
		
		return n;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i]+=i+1;
			
		}
		makeArray(a);
	}
}
