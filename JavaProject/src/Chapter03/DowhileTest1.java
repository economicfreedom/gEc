package Chapter03;

public class DowhileTest1 {
	public static void main(String[] args) {
		int sum=0, i=0;
		
		do {
			//99까지 반복 ->99보다 크면 break;
			if (i>99) {
				break;
			}
			sum+= i;
			i+=2;
		} while (true);
		 
		System.out.println(sum);
	}
}
		
		
//		
//		for(int i=2; i<=99; i=+2) {
//			sum += i;
//		}
//		System.out.println(sum);
//	}
//}
