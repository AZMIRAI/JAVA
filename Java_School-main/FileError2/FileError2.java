package FileError2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileError2 {

	public static void main(String []args) {
		writeList();
	}
	
	private static void writeList() {
		PrintWriter out = null;
		//AutoClosable 인터페이스를 구현해야된다
		//그 객체는 try with resources 절에 사용됨
		
		
	try(FileWriter fw = new FileWriter("out2.txt")){
		
		out = new PrintWriter(fw);
		out.println("hello? i love you");
		System.out.println("작업 종료");
		// out.close();
	} catch(IOException e ) {
		System.out.println("catch :"+e.getMessage());
	}
	
	}

}
