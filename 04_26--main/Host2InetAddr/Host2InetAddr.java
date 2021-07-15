package Host2InetAddr;

import java.net.*;
import java.util.Scanner;

public class Host2InetAddr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String hostName = "";
		while(true) {
		System.out.print("주소를 입력하세요~ : ");
		hostName = scan.next();
		if(hostName.equals("w")) {
			System.out.println("끝냈습니다");
			break;
		}
		try {
			InetAddress address = InetAddress.getByName(hostName);
			System.out.println("IP 주소 : " + address.getHostAddress());
		}catch(UnknownHostException e) {
			System.err.println(e.getMessage());
		}
		
		
		}
	}

}
