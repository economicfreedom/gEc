package ChapterPractice;
//1~100사이의 정수 중에서 3또는 4의 배수의 합을 계산하는 프로그램
public class ex {
	public static void main(String[] args) {
		int num1 = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0 || i%4==0) {
				num1 += i; //연산식에서 변수선언 및 초기화 x
			}
	}
		System.out.print("3 또는 4의 배수의 합="+ num1);
}
}
