import java.net.*;
import java.io.*;
public class Client_DT {
  public static void main(String[] args) throws UnknownHostException, IOException {
    Socket cs = new Socket("LocalHost", 5000);
    System.out.println("Client " + cs.getInetAddress() + " is communicating from port No.: " +cs.getPort());
    BufferedReader fromserver = new BufferedReader(new InputStreamReader(cs.getInputStream()));
    System.out.println(fromserver.readLine());
    fromserver.close();
    cs.close();
  }
}
