package Chapter09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample12 {
	public static void main(String[] args) throws Exception {

//		Writer writer= new FileWriter("D:\\output.txt");//upcasting
// 		운영체제에 따라서 경로 설정을 다르게 해야 작동됨
		Writer writer= new FileWriter("D:/output.txt");//upcasting
		char[] data = "홍길동".toCharArray();
		
		writer.write(data);
//		for (int i = 0; i < data.length; i++) {
//
//			writer.write(data[i]);
//		}
		System.out.println();
	}
}
