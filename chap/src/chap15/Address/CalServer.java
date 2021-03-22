package chap15.Address;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class CalServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(9800);
			System.out.println("접속을 기다립니다.");
			
			Socket socketOfServer = server.accept();
			InetAddress inetaddr = socketOfServer.getInetAddress();
			System.out.println(inetaddr.getHostAddress()+"로부터 접속 되었습니다.");
			
			OutputStream out = socketOfServer.getOutputStream();
			InputStream in = socketOfServer.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			String [] calLine = null;
			String result = null;
			
			while((line = br.readLine())!=null) {
				
				System.out.println("클라이언트로 부터 받은 문자열 : " + line);
				
				calLine = line.split(" ");
				result = cal(calLine[0],calLine[1], calLine[2]);
				
				pw.println(result); pw.flush();
				
			}
			pw.close(); br.close(); socketOfServer.close();
		}catch(Exception e) {
			System.out.println(e);
		}
			
	}
	
	public static String cal(String a, String b, String c) {
		
		int convertedA = Integer.parseInt(a);
		int convertedC = Integer.parseInt(c);
		
		switch (b){
		
			case "+":
				return a + " " + b + " " + c + " = " + (convertedA + (double)convertedC);
				
			case "-":
				return a + " " + b + " " + c + " = " + (convertedA - (double)convertedC);
				
			case "*":
				return a + " " + b + " " + c + " = " + (convertedA * (double)convertedC);
				
			case "/":
				return a + " " + b + " " + c + " = " + (convertedA / (double)convertedC);
				
			default :
				return "연산식이 잘못되었습니다.";

			}
			
		}
	
	
	

}
