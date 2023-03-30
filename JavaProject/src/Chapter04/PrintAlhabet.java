package Chapter04;

import java.util.Scanner;

public class PrintAlhabet {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("알파벳 입력");
	String a = scan.next();
	char b = a.charAt(0);
	
	for (char i = b; i >='a'; i--) {//abc계속 반복 b를 입력받음
		for (char j = 'a'; j <=i; j++) {//-1씩 감소하면서 이전 알파벳 출력
			System.out.print(j);
		}
		System.out.println();
	}
	}
}
