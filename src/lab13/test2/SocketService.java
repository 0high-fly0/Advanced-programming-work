package lab13.test2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketService {
    public static List<Socket> socketList=new ArrayList<Socket>();
    public static List<Integer> numberList=new ArrayList<Integer>();
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket=new ServerSocket(8000);
        System.out.println("聊天室已开启");
        while (1+1==2){
            Socket socket=serverSocket.accept();
            System.out.println("用户"+socket.getPort()+"已上线");
            socketList.add(socket);
            new Thread(new ServerThread(socket)).start();
        }
    }
}
