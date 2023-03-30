package Programmers;

public class 컨트롤제트 {
	public static void main(String[] args) {
		String s = "1 2 Z 4";
		s = s.replace("Z","-");
		s = s.replace(" ","+");
		String[] sArray = s.split(" ");
		int answer = 0;
		
		for (int i = 0; i < sArray.length; i++) {
			if (sArray[i].equals("+")){
				
				answer+=Integer.parseInt(sArray[i-1]);
		
			}else if(sArray[i].equals("Z")) {
				answer -= answer;
			}
		}
		
		System.out.println(answer);
		
	}
}
