package Chapter03;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;
public class ArrayMin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[7];
		int min = 0;
		System.out.println("양수 7개를 입력하세요");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();	
		}
		Arrays.sort(a);
		min=a[0];
		System.out.println("가장 작은 수는"+min);
		
		
	}
}
