package Chapter10;

class ThreadEx1 extends Thread{
@Override
public void run() {
	for (int i = 0; i <5; i++) {
		System.out.println("i: "+i);
	}
	
}
}
//class ThreadEx2 extends Thread{
class ThreadEx2 implements Runnable{

	@Override
	public void run() {
		for (int j = 10; j <14 ; j++) {
			System.out.println("j :"+j);
		}
		
	}
	
}


public class ThreadEx{
	public static void main(String[] args) {
//		스레드 객체 생성
		ThreadEx1 t1 = new ThreadEx1();
//		1번 형식
		//Thread t2 = new Thread(new ThreadEx2());
//		2번 방식
		Runnable r = new ThreadEx2();
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
