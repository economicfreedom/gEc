package Chapter06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		//n값으로 가지는 객체 생성(intObject: 참조변수)
		Integer intObject = Integer.valueOf(n);
		//auto boxing
		Integer intObject2 = n;
		
		System.out.println("intObject= "+intObject);
		System.out.println("intObject2= "+intObject2);
		
//		int m =intObject+intObject.intValue();//unboxing
		int m =intObject.intValue()+intObject.intValue();//auto unboxing
		System.out.println("m = "+m);//20출력
		
	}
}
