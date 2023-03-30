package Chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
//		FileOutputStream : 바이트 단위 출력을 위한 하위 스트림 클래스
//		FileOutputStream : 객체를 생성해서 output.txt를 만든다.
		
		OutputStream os= new FileOutputStream("d:/output.txt");//upcasting
		//바이트 단위로 문자열 읽는다.
		byte[] data ="DEF".getBytes();
//		os.write(data);
		os.write(data,1,2);//EF: 인덱스 1에서 2글자 서브스트링이랑은 다른 느낌
		os.flush();//인터넷이 불안정한 상태에서 네트워크 끊겼을때 전송되지 못한 데이터를 보낸다.
//		for (int i = 0; i < data.length; i++) {
////			FileOutputStream 객체에 바이트 배열원소를 넣는다.
//			os.write(data[i]);
//		}
		
		
	}
}