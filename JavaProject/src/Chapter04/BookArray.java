package Chapter04;

import java.util.Scanner;

class Book3{
	String title;
	String author;
	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}

}


public class BookArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		book 참조변수가 참조변수 2개를 가리킴
		Book3[] book = new Book3[2];
		
		//book.length : 2개 참조변수 (참조변수:book[0], 참조변수:book[1])<-참조변수 : book)
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목>> ");
//			nextLine() : 입력값을 한 행 받고 엔터
			String title = scan.nextLine();
			System.out.print("저자>> ");
			String author = scan.nextLine();
			//객체를 2번 생성(멤버:2개)
			book[i] = new Book3(title,author); 
		}
		for (int i = 0; i < book.length; i++) {
			System.out.print("("+book[i].title+ ", "+book[i].author+")");
			
		}
		
		
	}
}
