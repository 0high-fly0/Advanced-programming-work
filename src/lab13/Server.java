package lab13;

import java.io.*;
import java.net.*;

public class Server  {
  public static void main(String[] args) {
    double aNumber=10;
    int port = 8000;
    DataInputStream in;
    DataOutputStream out;
    ServerSocket server;
    Socket socket;

    try {
      server=new ServerSocket(port);
      socket=server.accept();
      in=new DataInputStream(socket.getInputStream());
      out=new DataOutputStream((socket.getOutputStream()));
      System.out.println((in.readDouble()));
      out.writeDouble(aNumber);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
