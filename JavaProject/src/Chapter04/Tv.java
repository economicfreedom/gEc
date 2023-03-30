package Chapter04;

public class Tv {
	String manu;
	int year;
	int size;
	
	public Tv(String manu, int year, int size) {
		this.year=year;
		this.manu=manu;
		this.size=size;
	}
	
	
	void show() {
		System.out.println(manu+"에서만든 "+year+"년형 "+size+"인치 TV");

	}
	public static void main(String[] args) {
		Tv myTv = new Tv("LG",2017,32);
		myTv.show();
	}
	
		

}
