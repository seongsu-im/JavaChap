package chap15.Address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookupEx {

	public static void main(String[] args) {
	
		if(args.length!=1) {
			
			System.out.println("ip 주소나 도메인 주소를 인자로~");
			System.exit(0); // 프로그램 종료
		}
		
		
		InetAddress inetAddr[] = null;
		InetAddress ia = null;
		
		try {
			ia = InetAddress.getByName(args[0]);
			inetAddr = InetAddress.getAllByName(args[0]);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("한개 출력 ============================");
		System.out.println(ia.getHostName());
		System.out.println(ia.getHostAddress());
		
		System.out.println("여러개 출력 ============================");
		for(int i =0; i<inetAddr.length; i++) {
			
			System.out.println(inetAddr[i].getHostName());
			System.out.println(inetAddr[i].getHostAddress());
			System.out.println(inetAddr[i].toString());
			System.out.println("=================================");
		}
		
	}

}
