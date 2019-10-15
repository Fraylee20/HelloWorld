//Server tarafı

import java.net.*;
import java.io.*;

public class server{
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(80);
		Socket s = ss.accept(); 

		System.out.println("Client Bağlandı"); 

		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

		String str = bf.readLine();
		System.out.println("Client : "+ str);
	}
}