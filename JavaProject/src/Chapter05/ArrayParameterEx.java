package Chapter05;

public class ArrayParameterEx {
	static void printStringArray(String arr[]){
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	static void repaceBe(String[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("be")) {
				arr[i]="eat" ;
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		String[] arr = {"to","be","or","not","to","be"}; 
		
		
		printStringArray(arr);
		System.out.println();
		repaceBe(arr);
	}
	
}
