package Networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
	public static void main(String[] args) throws UnknownHostException {
		 String url = "www.cmrit.ac.in";
		 
		 InetAddress inetAddress = Inet4Address.getByName(url);
		 
		 System.out.println(Arrays.toString(inetAddress.getAddress()));
		 
		 System.out.println(inetAddress.getHostAddress());
		 
		 System.out.println(inetAddress.isAnyLocalAddress());
	}
	
}
