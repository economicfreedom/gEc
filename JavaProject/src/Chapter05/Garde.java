package Chapter05;

import java.util.Scanner;



public class Garde {
	private  int math;
	private int science;
	private int english;

	public Garde(int math, int science, int english) {
	
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public int average() {
		
		return (math+science+english)/3;
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수학 과학 영어 수능로 3개의 점수 입력 >>");

		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		Garde average  =new Garde(math,science,english);
		System.out.println("평균은"+average.average());

	}
}
