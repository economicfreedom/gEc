package Chapter02;

import java.util.Arrays;

public class 가장큰수찾기 {
	public static void main(String[] args) {


		int[] array = {1,8,5};
		int[] array2 = array;

		Arrays.sort(array2);
		int a = array2[array.length-1];

		int count = 0 ;
		int[] answer = new int[2];
		for (int i = 0; i < array.length; i++) {
			if(array[i]<a) {
				count++;
			}else  {
				answer[1]=count;
				break;
			}

		}
		answer[0]=a;
		System.out.println(answer[0]+" "+answer[1]);
		System.out.println(a);
	}

}
