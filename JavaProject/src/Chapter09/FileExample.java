package Chapter09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class FileExample {
	public static void main(String[] args) throws Exception {
//		File dir = new File("d:/test");//uri:url+파일경로+db경로+지도경로
		File dir = new File("d:/test");//하위 디렉토리 포함
		File file1 = new File("d:/test/file1.txt");//파일
		File file2 = new File("d:/test/file1.txt");//파일
		File file3 = new File("d:/test/file1.txt");//파일
	    
		
//		dir.mkdir();//디렉토리 만들기
		dir.mkdirs();//하위 디렉토리까지 만들어줌
		file1.createNewFile();//파일만들기
		file2.createNewFile();//파일만들기
		file3.createNewFile();//파일만들기
		
		File test = new File("d:/test");//디렉토리 정보를 가지고 test 객체 생성
		File[] contents =test.listFiles();//디렉토리 정보를 가지고온다.
		System.out.println("날짜\t시간\t형태\t크기\t이름");
		System.out.println("-------------------------------------");
		
		//년월일 오전/오후 시분
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
			//1680054206158 : 1970sus 1월1일 기준으로 오늘까지의 milisec(1/1000초)로 계산된 값 (long type)
//			System.out.println(contents[i].lastModified());//마지막 생성일자
//			System.out.println(new Date(contents[i].lastModified()));//마지막 생성일자
			System.out.println(sdf.format(new Date(contents[i].lastModified())));//마지막 생성일자
			//파일인지 디렉토리인지 확인
			if (contents[i].isDirectory()) {
				System.out.print("\t<DIR>\t\t"+contents[i].getName());
			}else {
				System.out.print("\t\t"+contents[i].length()+"\t"+contents[i].getName());//디렉토리나 파일이름
				
			}
			System.out.println();
		
		}
	}
}
