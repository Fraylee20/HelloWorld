import java.net.*;
import java.io.*;

public class client{

public static void main(String[] args) throws IOException{
	Socket s = new Socket("localhost",80);
	PrintWriter pr=new PrintWriter(s.getOutputStream());
	pr.println("hello");
	pr.flush();
}
	
}