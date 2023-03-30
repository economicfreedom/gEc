package Chapter02;
public class AssignmentIncDecOperactor {
	public static void main(String[] args) {
		
		// 초기화
		int a=3, b=3, c=3;
		
		a+=3; // a = a + 3
		b*=3; // b = b * 3
		c%=2; // c = c % 2;
		
		System.out.println( "a = " + a ); // 6
		System.out.println( "b = " + b ); // 9
		System.out.println( "c = " + c ); // 1
		
		
		// d가 3에서 4가 되기전 a로 대입되었고
		// 대입된 이후 (후위연산자) ++ 가 적용되기때문에 3에서 4로 바뀜
		// 그래서 a는 3,  d는 4가 된다.
		int d = 3;
		a = d++;
		System.out.println("a= " + a + ", d= "  + d ); // a= 3, d= 4
		
		// 대입되기전부터(전위연산자) ++ 가 적용되기때문에 기존 4에서 5로 바뀜
		// 당연히 a 에 되입되는것도 변경된 5로 대입되고
		// 그러니까 둘다 5, 5 가 출력된다.
		a = ++d;
		System.out.println("a= " + a + ", d= "  + d ); // a= 5, d= 5
		
		
		// 동일한 맥락
		// 기존 5의 값이 a 로 들어가고
		// 들어간이후에 -- 감소되서 d는 4가 되어버림
		a = d--;
		System.out.println("a= " + a + ", d= "  + d ); // a= 5, d= 4
		
		// 동일한 맥락 2
		a = --d;
		System.out.println("a= " + a + ", d= "  + d ); // a= 3, d= 3
		
		
		
	}
}
