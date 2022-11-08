import java.io.*;
import java.net.*;
class RemoteServer {
  public static void main(String args[]) {
    try {
      int Port;
      BufferedReader Buf = new BufferedReader(new
      InputStreamReader(System.in));
      System.out.print(" Enter the Port Address : ");
      Port = Integer.parseInt(Buf.readLine());
      ServerSocket ss = new ServerSocket(Port);
      System.out.println(" Server is Ready To Receive a Command. ");
      System.out.println(" Waiting ..... ");
      Socket s = ss.accept();
      if (s.isConnected() == true)
      System.out.println(" Client Socket is Connected Successfully. ");
      InputStream in = s.getInputStream();
      OutputStream ou = s.getOutputStream();
      BufferedReader buf = new BufferedReader(new InputStreamReader(in));
      String command = buf.readLine();
      PrintWriter pr = new PrintWriter(ou);
      pr.println(command);
      Runtime H = Runtime.getRuntime();
      Process P = H.exec(command);
      System.out.println(" The " + command + " Command is Executed Successfully. ");
      pr.flush();
      pr.close();
      ou.close();
      in.close();
    }
    catch (Exception e) {
      System.out.println(" Error : " + e.getMessage());
    }
  }
}
