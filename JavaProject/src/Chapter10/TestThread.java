package Chapter10;
import java.awt.Toolkit;
public class TestThread {
	public static void main(String[] args) {
		//스레드 객체 생성
		TimerThread th=	new TimerThread();
		//스레드 실행되면서 JVM 스케줄링
		th.start();
		
	}
}
