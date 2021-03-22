package chap15.Address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LoclaHostEx {

	public static void main(String[] args) {


		InetAddress inetaddr = null;

		try {
			inetaddr=InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
		}

		System.out.println(inetaddr.getHostName());
		System.out.println(inetaddr.getHostAddress());
	}

}
