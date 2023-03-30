
public class adfasdf {
		public class PrimeNumbers {
		    public void main(String[] args) {
		        int k = 100; //초기화
		        
		        // 바깥쪽 for 문: 2부터 100까지의 수 중에서 소수 찾기
		        // 내부 for 문: 소수 여부 판단
		        for (int i = 2; i <= k; i++) {
		            boolean isPrime = true;
		            
		            // i를 2부터 i-1까지의 수로 나누어 떨어지는지 확인
		            for (int j = 2; j < i; j++) {
		                if (i % j == 0) {
		                    // 나누어 떨어지면 소수가 아님
		                    isPrime = false;
		                    break;
		                }
		            }
		            
		            // 만약 isPrime 변수가 true인 경우,소수이므로 출력
		            if (isPrime) {
		                System.out.println(i);
		            }
		        }
		    }
		}
}
