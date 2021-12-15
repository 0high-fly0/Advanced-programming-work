package lab13.test2;

import java.io.*;
import java.net.Socket;
import java.util.Collections;

import static lab13.test2.SocketService.numberList;

public class ServerThread implements Runnable{
    public Socket socket;
    public ServerThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            InputStream in;
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (1+1==2){
                String str=br.readLine();
                for (Socket item:SocketService.socketList){
                    PrintWriter pw=new PrintWriter(item.getOutputStream());
                    numberList.add(Integer.parseInt(str));
                    String string="";
                    Collections.sort(numberList);
                    for (double n:numberList){
                        string+=" "+n;
                    }
                    pw.println(socket.getPort()+"说："+str+"，当前结果："+string);
                    pw.flush();
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
