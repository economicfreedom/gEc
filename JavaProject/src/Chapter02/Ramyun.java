package Chapter02;
public class Ramyun {
	public static void main(String[] args) {
		
		// 메소드 호출
		buy();
		boil();
		put();
		eat();
		
	}
	
	
	// 메소드 buy(), boil(), eat()
	public static void buy() { System.out.println("라면을 사온다"); }
	public static void boil() { System.out.println("물을 끓인다"); }
	public static void put() { System.out.println("라면을 넣는다"); }
	public static void eat() { System.out.println("맛있게 먹는다"); }
	
	
	
}
