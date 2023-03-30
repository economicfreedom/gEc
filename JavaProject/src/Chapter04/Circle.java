package Chapter04;

public class Circle {
	int radius;//멤버변수(필드)
	String name;
	
//	오버로딩
	public Circle() {}//생성자(기본)
	public Circle(int a) {}//생성자(매개변수 하나의 기본 생성자)
	public Circle(int a,int c) {}//생성자(매개변수 두개의 생성자)
	public double getArea() {//멤버함수(메소드)
		
		return 3.14*radius*radius;
		
	} 
	public static void main(String[] args) {
		Circle pizza; // 참조변수(태명 비슷) 선언, Circle이 클래스(객체를 생성하는 틀/판)
//		new Circle();//이름없는 피자
		pizza=new Circle();//객체 생성 //이름있는 피자
		pizza.radius=10;//멤버변수 값 셋팅
		pizza.name="자바피자";//멤버변수 값 셋팅
		double area = pizza.getArea();//멤버함수 호출
		System.out.println(pizza.name+"의 면적은"+area);//멤버변수 값 사용
		
		Circle donut =new Circle();//객체 생성 //이름있는 도넛
		donut.radius=2;
		donut.name="자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);//멤버변수 값 사용
	}
}
