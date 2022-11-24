import java.net.*;
import java.io.*;

public class Server{
	public static void main(String [] args){
	   	try{
			ServerSocket ss = new ServerSocket(6666);
			System.out.println("Connection Established");
			Socket s = ss.accept();
			DataInputStream din = new DataInputStream(s.getInputStream());
			String str = (String) din.readUTF();
			System.out.println("Message from CLient = " +str);
			s.close();
	   	}
	  	catch(Exception e){
			System.out.println(e);
	   	}
	}
}
