package Chapter04;

public class Circle2 {
//	4.멤버변수가 1
//	4. 매개변수 값이 멤버변수로 저장됨
	int radius; //10
	String name;//"자바피자"
	public double getArea() {
		return 3.14*radius*radius;
	}
//	2.생성자 호출됨
	public Circle2() {
//		3.반지름이 1
		radius=1; 
		name="";
	}
//	2.생성자 호출됨(매개변수 받음
	public Circle2(int r,String n) {
//		3. 매개변수 값이 저장
		radius=r;//10;
		name=n;// "자바피자"
	}
	public static void main(String[] args) {
//		1.객체 생성하면서 생성자 호출
	//  Circle2 pizza=new Circle2();//반지름이 1이고, 이름이 없는 피자 생성
//		1.객체 생성하면서 생성자 호출(매개변수 10, "자바피자" 2개를 들고 감) 
		Circle2 pizza =new Circle2(10, "자바피자");
		double area =pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area);
		
		Circle2 donut = new Circle2();//반지름이 1이고, 이름은 없는 도넛 생성
		donut.name="자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);
		
		
	}
	
}
