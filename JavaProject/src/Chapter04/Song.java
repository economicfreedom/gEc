package Chapter04;

public class Song {
	private	int year;
	private	String country;
	private	String title;
	private	String artist;
	public Song() {	
	}
	public Song(int year, String country, String title, String artist) {
		super();
		this.year = year;
		this.country = country;
		this.title = title;
		this.artist = artist;
	}
	void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
	public static void main(String[] args) {
		Song song =new Song(1978,"스웨덴","Dancing Queen","ABBA");
		song.show();
	}
	
	
}
