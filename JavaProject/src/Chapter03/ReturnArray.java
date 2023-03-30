package Chapter03;



public class ReturnArray {
//	리턴 타입에 배열크기를 표시하면 오류
//	static int[4] makeArray() {
	static int[] makeArray() {
		int temp[] = new int[4];
//		리턴할때 [] 추가하면 오류
//		return temp[];
//		temp.length = 4
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i; //0,1,2,3을 temp배열에 넣음
		}
		return temp;
		
		
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray=makeArray();
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]+" ");
		}
	}
	
	
}
