package lab13.test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client  {
  public static void main(String[] args) {
    double aNumber=0;
    int port = 8000;
    DataInputStream in;
    String host="localhost";
    DataOutputStream out;
    Socket socket;
    System.out.print("请输入半径：");
    Scanner input=new Scanner(System.in);
    aNumber=input.nextDouble();
    try {
      socket=new Socket(host,port);
      in=new DataInputStream(socket.getInputStream());
      out=new DataOutputStream((socket.getOutputStream()));
      out.writeDouble(aNumber);
      System.out.println("圆的面积为："+(in.readDouble()));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
