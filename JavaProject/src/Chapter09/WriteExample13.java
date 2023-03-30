package Chapter09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample13 {
	public static void main(String[] args) throws Exception {


		Writer writer= new FileWriter("D:/output.txt");//upcasting
//		char[] data = "홍길동".toCharArray();
		String data = "안녕 자바 프로그램";
		//자바: "안녕 자바 프로그램"에서 인덱스 3번에서부터 두 글자를 읽어서 파일로 저장
		writer.write(data,3,2);
		
		writer.close();
	}
}
