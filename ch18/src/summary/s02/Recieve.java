package summary.s02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Recieve {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(1234);
        byte[] arr=new byte[200];
        Socket socket=server.accept();
        InputStream input=socket.getInputStream();
        int length=input.read(arr);
        String str=new String(arr,0,length);
        System.out.println(str);
        String sendStr=null;
        if(str.equals("bisxtbisxt")){
           sendStr= "登录成功";
        }else {
           sendStr= "登录失败";
        }
        OutputStream output = socket.getOutputStream();
        output.write(sendStr.getBytes());
        output.close();
    }
}
