package chap14.Reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fout = null;
		
		int c;
		
		try {
			fout= new FileWriter("d:/temp/test1.txt");
			while((c=in.read())!=-1) {
				fout.write(c);
			}
			fout.flush();
			
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		
	}

}
