package Chapter05;

//생명 1개, 날개2개, 걷다, 먹는다+수영한다.(인터페이스)
public class Duck extends Bird implements Swim2,Fly{

	@Override
	public void swim() {
		System.out.println("duck swims.");
		
	}

	@Override
	public void fly() {
		System.out.println("duck flies.");
		
		
	}

}
