package Chapter05;
/*
 * super()를 사용
 */
class Point2{
	private int x,y;//4. 0,0 저장 //d.(5,6) 저장
	public Point2() {//2.슈퍼클래스 생성자 호출
		this.x = this.y = 0;//3. 멤버 저장

	}
	public Point2(int x, int y) {//b.(5,6)
		this.x = x;	this.y = y;//c.멤버 저장

	}

	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}

}
//서브 클래스(자식)
class ColorPoint2 extends Point2{//슈퍼 클래스(부모)
	private String color; //6. blue 저장

	public ColorPoint2(int x,int y,String color) { //1,(5,6,"blue")
		super(x,y);//a.(5,6)
		this.color = color;//5. 멤버 저장
		
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint2 cp	= new ColorPoint2(5, 6, "blue");//객체 생성, (0,0), blue 셋팅
		
		cp.showColorPoint();
	}
}
