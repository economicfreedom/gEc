package Chapter09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {
	public static void main(String[] args) throws Exception {


		Reader  reader=	new FileReader("D:\\test.txt");//upcasting
		
		int readData;
		char[] cbuf = new char[2];
		String data ="";
		while(true) {
//			readData = reader.read();//한개의 문자 단위로 읽는다 ex>호미.
			readData = reader.read(cbuf);//한개의 문자 단위로 읽는다 ex>삽.
			if (readData==-1) {//한개의 문자 단위로 읽는다
				break;
			}
			data += new String(cbuf, 0, readData);
		}
		System.out.println(data);
		reader.close();
	}
}
