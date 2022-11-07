import java.net.*;
import java.io.*;
import java.util.Date;
public class Server_DT {
  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(5000);
    System.out.println("The Server has reserved port No.: "+ss.getLocalPort() + " for this Service");
    Socket cs = ss.accept();
    System.out.println( "Client with IP Address " + cs.getInetAddress() +" has communicated via port No.: " + cs.getPort());
    Date d = new Date();
    String s = "Current Date & Time on Server is:" + d;
    PrintWriter toclient = new PrintWriter(cs.getOutputStream(), true);
    toclient.print(s);
    toclient.close();
    cs.close();
    ss.close();
  }
}
