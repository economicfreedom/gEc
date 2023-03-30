package Chapter04;

public class Book2 {
//		6.멤버 저장
	String title;//"춘향전"
	String author;//"작자미상"
//	4.생성자 호출
//	d.생성자 호출됨
	public Book2(String title, String author) {
		System.out.println("생성자1 호출됨");
//		매개변수를 this 자기자신의 객체 멤버로 저장
//		5.멤버 저장
		this.title=title;
		this.author=author;	
	}
//	2.생성자 호출됨
	public Book2(String title) {
		
//		3.this로 생성자 호출
		this(title, "작자미상");
	}
//	b.생성자 호출됨
	public Book2() {
//		c. this로 생성자 호출
		this("", "");//첫번째 라인에 안오면 오류 발생
		System.out.println("생성자 호출됨");
		
	}
	void show() {
		System.out.println(title+" "+author);
	}
	public static void main(String[] args) {
		Book2 littlePrince = new Book2("어린왕자","생텍쥐베리");
//		1.객체 생성하면서 생성자 호출
		Book2 loveStory = new Book2("춘향전");
		
//		a.객체 생성하면서 생성자 호출
		Book2 emptyBook = new Book2();
		//System.out.println(littlePrince.title+" "+littlePrince.author);
		//System.out.println(loveStory.title+" "+loveStory.author);
		littlePrince.show();
		loveStory.show();
		emptyBook.show();
	}
}
