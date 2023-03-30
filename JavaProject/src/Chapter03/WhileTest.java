package Chapter03;

public class WhileTest {
	public static void main(String[] args) {
		int sum=0, i=0;
		
		while(i<100) {
//			sum=sum+i;
			sum+=i;
//			i=i+2;
			i+=2;
//			@@@### i ===> : 코드가 복잡할때 한번에 보기 쉽게, 가독성을 높이는 방법 중 하나
//			값이 출력되는 방식이 이해가 잘 안될땐, 하나씩 출력해보기!
			System.out.println("@@@### i ===>"+i);
			System.out.println("@@@### sum ===>"+sum);
		}
		System.out.println(sum);
		
		
//		int num=0;
//		int sum=0;
//		
//		while(num<99) {
//			if(num%2==0) {
//				sum += num;
//				num++;
//		(System.out.println(sum);)
//		(System.out.println(i);)
//			}
//		}
//		System.out.print(sum);
	}
}
