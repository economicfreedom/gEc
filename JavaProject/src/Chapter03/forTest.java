package Chapter03;

public class forTest {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<100; i+=2) //i+=2 : 짝수입니다.
			sum += i;
		System.out.println(sum);
	}
}
		//		int sum = 0;
//		//0~99까지 짝수만
//		for(int i=0; i<100; i++) { 
//			if(i%2==0) {
//				sum += i;
////				i++; //이미 for문에 있ㅇ더서 필요없음 ,while과 다르다
//			}
//		}
//		System.out.println(sum);
//	}
//}
