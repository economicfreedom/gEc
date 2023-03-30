package Chapter05;

import java.util.Scanner;

public class TrapezoidMain {
static class Trapezoid{
	private double down,up,height;
	
	
	public Trapezoid(double down, double up, double height) {
		super();
		this.down = down;
		this.up = up;
		this.height = height;
	}


	public double getArea() {
	
		
		return (down+up)*height/2;
	}
	
	
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> ");
		
		
		int down = scan.nextInt();
		int up = scan.nextInt();
		int height = scan.nextInt();
		
		Trapezoid a = new Trapezoid(down,up,height);
		
		System.out.print("사다리꼴의 면적은 "+a.getArea());
		
	}
}
