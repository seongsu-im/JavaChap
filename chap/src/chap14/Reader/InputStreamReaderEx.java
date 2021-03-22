package chap14.Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderEx {

	public static void main(String[] args) {

		
		InputStreamReader is = null;
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("d:/temp/han.txt");
			is = new InputStreamReader(fis, "UTF-8");
			int c;
			System.out.println("���ڵ� ���� ������ " + is.getEncoding());
			while ((c=is.read())!=-1) {
				
				System.out.print((char)c);
			}
			is.close();
			fis.close();
	
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		
	}

}
