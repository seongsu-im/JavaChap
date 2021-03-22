package chap15.Address;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CrawEx {

	public static void main(String[] args) {


		try {
			URL url = new URL("https://en.wikipedia.org");

			BufferedReader in = 
					new BufferedReader(new InputStreamReader(url.openStream()));

			String line;

			while((line=in.readLine())!=null) 

				System.out.println(line);

			in.close();



		} catch (IOException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();
			System.out.println("URL 에서 데이터를 읽는 중");
		} 

	

	}


}
