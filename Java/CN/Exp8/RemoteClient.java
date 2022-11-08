import java.io.*;
import java.net.*;
class RemoteClient {
  public static void main(String args[]) {
    try {
      int Port;
      BufferedReader Buf = new BufferedReader(new
      InputStreamReader(System.in));
      System.out.print(" Enter the Port Address : ");
      Port = Integer.parseInt(Buf.readLine());
      Socket s = new Socket("localhost", Port);
      if (s.isConnected() == true)
      System.out.println(" Server Socket is Connected Successfully. ");
      InputStream in = s.getInputStream();
      OutputStream ou = s.getOutputStream();
      BufferedReader buf = new BufferedReader(new
      InputStreamReader(System.in));
      BufferedReader buf1 = new BufferedReader(new InputStreamReader(in));
      PrintWriter pr = new PrintWriter(ou);
      System.out.print(" Enter the Command to be Executed : ");
      pr.println(buf.readLine());
      pr.flush();
      String str = buf1.readLine();
      System.out.println(" " + str + " Opened Successfully. ");
      System.out.println(" The " + str + " Command is Executed Successfully. ");
      pr.close();
      ou.close();
      in.close();
    }
    catch (Exception e) {
      System.out.println(" Error : " + e.getMessage());
    }
  }
}
