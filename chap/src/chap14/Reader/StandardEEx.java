package chap14.Reader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StandardEEx {

	public static void main(String[] args) throws IOException {


		OutputStream os = new FileOutputStream("d:/temp/test1.txt");

		os.write((byte)10); os.write((byte)20); os.write((byte)30);
		os.flush();
		os.close();


		os = new FileOutputStream("d:/temp/test2.txt");

		byte[] bArray1 = {10,20,30};
		os.write(bArray1);
		os.flush();
		os.close();


		os = new FileOutputStream("d:/temp/test3.txt");

		byte[] bArray2 = {10,20,30,40,50};
		os.write(bArray2,1,3);
		os.flush();
		os.close();

		//		InputStream is = new FileInputStream("d:/temp/test1.txt");
		//		int data;
		//		while((data = is.read())!=-1) {
		//			System.out.println(data);
		//			is.close();


		//			InputStream is = new FileInputStream("d:/temp/test2.txt");
		//			byte[] buffer = new byte[100];
		//			int count;
		//			while((count = is.read(buffer))!=-1) {
		//
		//				for(int i =0; i<count; i++) {
		//					System.out.println(buffer[i]);

		InputStream is = new FileInputStream("d:/temp/test3.txt");
		byte[] buffer = new byte[5];
		int count;
		while((count = is.read(buffer,2,3))!=-1) {

			for(int i =0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
	}
}

