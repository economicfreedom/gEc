package ChapterPractice;

public class IrregularArray정답 {
	public static void main(String[] args) {
//		int n[][] = {{10,11,12},{20,21},{30,31,32},{40,41}};
//		비정방향배열은 열은 비워두고 행만 선언함	
		int[][] n =new int[4][];
		n[0]=new int[3];
		n[1]=new int[2];
		n[2]=new int[3];
		n[3]=new int[2];
		int a = 10;
//      4번 반복
		for(int i = 0; i<n.length; i++) {
//			3,2,3,2번 반복
			for (int j = 0; j < n[i].length; j++) {
				n[i][j]=(i+1)*10+j;
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
}
