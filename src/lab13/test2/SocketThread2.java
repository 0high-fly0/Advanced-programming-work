package lab13.test2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketThread2 implements Runnable{
    public Socket socket;
    public SocketThread2(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (1+1==2){
                String str=br.readLine();
                System.out.println(str);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
