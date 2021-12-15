package lab13.test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server  {
  public static void main(String[] args) {
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
      out.writeDouble(Math.pow(in.readDouble(),2)*3.14);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
