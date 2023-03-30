package Chapter09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list=	new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.print("사람 수 입력");
		int num = scan.nextInt();
		String[] a =new String[num];
		String b = "";
		for (int i = 0; i < a.length; i++) {
			System.out.print("이름 입력>> ");
			a[i] = scan.next();
			list.add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(list.get(i)+" ");
		}
		
		for (int i = 0; i < a.length; i++) {
			if (list.get(0).length()<list.get(i).length()) {
					b=list.get(i);
			}
		}
		System.out.println("가장 긴 이름"+b);
		
		scan.close();
	}
}
