package practise.p02;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        File file=new File("src/practise/p02/1.png");
        byte [] arr=new byte[(int)file.length()];
        InputStream input=new FileInputStream(file);
        input.read(arr);
        Socket socket=new Socket("192.168.9.233",2233);
        OutputStream output=socket.getOutputStream();
        output.write(arr);
        System.out.println(arr.length);
//        String str=new String(arr);
//        System.out.println(str);
        output.close();
    }
}
