package Chapter05;

//생명 1개(객체 생성시 멤버 4개)
abstract class Bird extends Animal {
	public int wing = 2;
	public void walk() {
		System.out.println("walk");
	}
	public void eat() {
		System.out.println("eat");
	}

}
