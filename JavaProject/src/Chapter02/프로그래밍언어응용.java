package Chapter02;

import java.util.Scanner;

public class 프로그래밍언어응용 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input;
		int trynumber;
		String password;
		password = "myongji60" ;
		
		
		
		for ( trynumber = 1; trynumber < 4; trynumber++) {
			System.out.print("암호를 입력하세요: ");
			input = scan.next();
			if (password.equals(input)) {
				System.out.println("환영합니다.");
				break;
			}else if(trynumber==3) {
				System.out.println("접속을 거부합니다.");
			}else {
				System.out.println("암호가 틀립니다.");
			}
		}
		scan.close();
	}

}
