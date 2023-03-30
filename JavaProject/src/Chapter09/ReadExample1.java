package Chapter09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		//		FileInputStream :바이트 단위 입력을 위한 하위 스트림 클래스
		//		InputStream :바이트 단위 입력을 위한 하위 스트림 클래스
		int readByte;
		InputStream is=	new FileInputStream("D:\\test.txt");//upcasting
		while ((readByte= is.read())!=-1) {
			System.out.print((char)readByte);
		}
//		while (true) {
//			readByte= is.read();//byte 단위로 읽는다.(정수로 받음)
//			//파일의 끝에는 -1이 존재(프로그래밍 언어 동일): EOF(end of file)
//			if (readByte==-1) {
//				break;
//
//			}
//			/*
//			 * aaa:97
//			 * bb:98
//			 * c:99
//			 * 13:엔터(개행문자)
//			 * 10:첫번째 열
//			 * 97979713109898131099
//			 */
//			System.out.print((char)readByte);
//		}
		
		is.close();
	}
}
