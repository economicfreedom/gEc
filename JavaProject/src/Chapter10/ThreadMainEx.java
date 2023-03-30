package Chapter10;

public class ThreadMainEx {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();//현재 실행중인 스레드의 이름
		long id = Thread.currentThread().getId();//현재 실행중인 스레드의 고유번호
//		main 메소드의 우선순위 초기값은 5
		int priority = Thread.currentThread().getPriority();//현재 실행중인 스레드의 우선순위
//		RUNNABLE : 스레드  6가지 상태중 하나
		Thread.State s= Thread.currentThread().getState();
		System.out.println("현재 스레드 이름: "+name);
		System.out.println("현재 스레드 ID: "+id);// 1번이 나옴
		System.out.println("현재 스레드 우선순위 값"+priority);
		System.out.println("현재 스레드 상태"+s);
	
	}
}
