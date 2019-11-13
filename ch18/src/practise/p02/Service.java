package practise.p02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) throws IOException {
        File file=new File("src/2.png");
        if(!file.exists()){
            file.createNewFile();
        }
        ServerSocket server=new ServerSocket(2233);
        Socket socket=server.accept();
        InputStream input=socket.getInputStream();
        byte [] arr=new byte[165568];
        input.read(arr);
        String str=new String(arr);
        OutputStream output=new FileOutputStream(file);
        output.write(arr);
        output.close();
    }
}
