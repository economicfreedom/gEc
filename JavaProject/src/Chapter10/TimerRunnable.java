package Chapter10;

public class TimerRunnable implements Runnable{

	int n=0;
	@Override
	public void run() {
	
		while(true) {
			System.out.println(n);
			n++;
			//1초마다 실행
			try {
				Thread.sleep(1000);
//				예외 발생했을때 e로 catch 해서
			} catch (InterruptedException e) {
//				printStackTrace 메소드로 기본 예외처리 메시지를 출력
				e.printStackTrace();
			}
		}
	}



}
