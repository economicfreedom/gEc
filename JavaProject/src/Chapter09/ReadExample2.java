package Chapter09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {

		InputStream is=	new FileInputStream("D:\\test.txt");//upcasting
		int readByte;
		byte[] readBytes = new byte[3];
		String data = "";
//		while ((readByte= is.read())!=-1) {
//			System.out.print((char)readByte);
//		}
		int i =0;
		while (true) {
//			readByte= is.read();//byte 단위로 읽는다.(정수로 받음)
			//파일의 끝에는 -1이 존재(프로그래밍 언어 동일): EOF(end of file)
			readByte= is.read(readBytes);//3byte 단위로 읽는다.(정수로 받음) ex> 삽
			if (readByte==-1) {
				break;

			}
//			System.out.print((char)readByte);
//			System.out.println(readByte);
			//readBytes 를 0인덱스에서 readByte 길이만큼 읽는다.
			data += new String(readBytes,0,readByte);
			i++;
			System.out.println(i+" "+data);
		
		}
		
		is.close();
	}
}
