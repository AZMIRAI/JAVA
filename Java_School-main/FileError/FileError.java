package FileError;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileError {
	
	public static void main(String []args) {
		writeList();
	}
	
	private static void writeList() {
		PrintWriter out = null;
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("out.txt ");
			out = new PrintWriter(fw);
			out.println("babo babo");
			System.out.println("작업종료...");
			out.close();
		} catch(IOException e) {
			System.out.println("catch:"+e.getMessage());
		} finally {
			System.out.println("finally code ...");
			out.close();
			System.out.println("final end...");
		}
	}
}