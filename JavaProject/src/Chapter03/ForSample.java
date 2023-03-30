package Chapter03;
//for문을 이용하여 1부터 10까지 덧셈을 표시하고 합을 구하시오.
public class ForSample {
	public static void main(String[] args) {
//		for(int i=1; i<=10; i++) {
//			if (i<=9) {
//				System.out.print(i+"+");
//			} else {
//				System.out.print(i+"=");
//			}
////			1~10까지 숫자를 sum에 누적
//			sum+=i;
//		}
//		System.out.println(sum);
//	}
//}

		int sum = 0;
		String operator = null;

		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				operator = ("+");
				if(j<=9) {
					System.out.print(j+"+");				
				}else {
					System.out.print(j+"=");
				}
			}
			sum += i;
		}
		System.out.print(sum);
	}
}
