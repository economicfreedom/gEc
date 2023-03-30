package Chapter06;

class Point3{
	private int x,y;//a->(2,3), b->(2,3) c->(3, 4)

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {//Object obj=new Point3(2,3) 업 캐스팅
			//x,y=2,3 p.x=2, p.y=3
			//x,y=2,3 p.x=3, p.y=4
			Point3 p = (Point3)obj;//다운캐스팅
			if (x == p.x&&y==p.y) 
				return true;
			else
				return false;
	}
}
public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);
		
		if (a==b) 
			System.out.println("a == b");
		else 
			System.out.println("a != b");
			
		if(a.equals(b))//equals: 객체자체를 비교->
			System.out.println("a is equal to b");
		else
			System.out.println("a is equal not to b");
		if(a.equals(c))//equals: 객체자체를 비교->
			System.out.println("a is equal to c");
		else
			System.out.println("a is equal not to c");
			
		
	}
}
