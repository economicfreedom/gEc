package Chapter06;

	class Point2{
		private int x,y;

		public Point2(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return "Point2("+x+"."+y+")";
		}
	}
	public class ToStringEx {
	public static void main(String[] args) {
		Point2 p = new Point2(2, 3);
		System.out.println(p);//Chapter06.Point2@15db9742
		System.out.println(p.toString());
		System.out.println(p.toString()+"입니다.");//Point(2,3)입니다.
	
	}
}
