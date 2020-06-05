package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) {
		// Inetaddress : 자바에서 IP 주소를 다루는 클래스
		try {
			InetAddress ip = InetAddress.getLocalHost();
			
			System.out.println("hostname : "+ip.getHostName());
			System.out.println("hostaddress : "+ip.getHostAddress());
			System.out.println("toString : "+ip.toString());
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
 