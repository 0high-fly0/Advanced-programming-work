package lab13.test2;

import java.net.Socket;

public class SocketClient2 {
    public static void main(String[] args) throws Exception{
        Socket socket=new Socket("localhost",8000);
        System.out.println("连接成功");
        new Thread(new SocketThread1(socket)).start();
        new Thread(new SocketThread2(socket)).start();
    }
}
