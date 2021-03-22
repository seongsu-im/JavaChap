package chap14.Reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FinalFileExx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		String srcFile = "d:/temp/dorian.txt";
		String destFile = "d:/temp/dorian_copy";
		String inStr = null;
		Scanner scan = new Scanner(System.in);
		try {
//			br = new BufferedReader(new InputStreamReader(System.in));
//			bw = new BufferedWriter(new FileWriter("d:/temp/console.txt"));
			br = new BufferedReader(new FileReader(srcFile));
			bw = new BufferedWriter(new FileWriter(destFile));

			while(((inStr =br.readLine())!=null)) {
				System.out.println(inStr);
				bw.write(inStr+"\n");
			}bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block

		}
	}

}
