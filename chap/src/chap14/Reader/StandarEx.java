package chap14.Reader;

import java.io.IOException;

public class StandarEx {

	public static void main(String[] args) throws IOException {


		int b, len =0;
		int bArray[] = new int[100];

		System.out.println("�Է� -----");

		while((b=System.in.read())!= '\n') {
			System.out.printf("%c(%d)", (char) b, b);
			bArray[len++] = b;

		}

		System.out.println("��� ------");
		for(int i =0; i<len; i++) {

			System.out.write(bArray[i]);

		}

		System.out.flush();
	}

}
