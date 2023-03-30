package Chapter09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample14 {
	public static void main(String[] args) throws Exception {


		Writer writer= new FileWriter("D:/output.txt");//upcasting
		char[] data = "홍길동".toCharArray();
		
		writer.write(data,1,2);//길동 "홍길동"에서 인덱스 1번에서 2번인덱스 까지 읽어서 파일로 저장
		
		writer.close();
	}
}
