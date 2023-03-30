package Chapter04;

import java.util.Scanner;

public class Rectangle {
	int width;//객체로 접근해서 스캐너에서 입력받은 정수가 셋팅
	int height;//객체로 접근해서 스캐너에서 입력받은 정수가 셋팅
	int NASDFDSAF = 0;
	public int getArea() {//메소드 호출하면서 사각형의 넓이를 구할수 있음
		return width*height;
	}
	public static void main(String[] args) {
//		new 연산자로 Rectangle 객체를 생성하면서, Rectangle 클래스 타입의 참조변수 rect 가 가리킴
		Rectangle rect =new Rectangle();//구성: 멤버3개(멤버변수[필드]2개+멤버함수[메소드]1개)
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		rect.width=scan.nextInt();
		System.out.print(">> ");
		rect.height=scan.nextInt();
		System.out.println("사각형의 면적은"+rect.getArea());
		scan.close();
	}
}
