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
import java.text.SimpleDateFormat;
import java.util.Date;

public class EchoServer {
	public static void main(String[] args) {	//서버
		Date now =new Date();
		String strNow1 = now.toString();
		SimpleDateFormat sdf=
				new SimpleDateFormat("yyyy-MM-dd-hh:mm:ssa");
		String strNow2 = sdf.format(now);
		
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("접속을 기다립니다");
			Socket socketOfServer = server.accept();
			InetAddress inetaddr =socketOfServer.getInetAddress();
			System.out.println(inetaddr.getHostAddress()+"로 부터 접속하였습니다.");
			OutputStream out = socketOfServer.getOutputStream();
			InputStream in = socketOfServer.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while((line = br.readLine())!=null) {
				System.out.println("클라이언트로 부터 전송 받은 문자열 " + line);
				pw.println(strNow2 +">>" +line);pw.flush();
			}
			pw.close();br.close();socketOfServer.close();
		}catch(Exception e) {System.out.println(e);}

	}
}