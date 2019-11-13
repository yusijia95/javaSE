package summary.s02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        Scanner sca = new Scanner(System.in);
        String account=null;
        String password=null;
        Socket socket=null;
        OutputStream output=null;
        try {
            socket = new Socket("192.168.9.233", 1234);
            account = sca.next();
            password = sca.next();

            output = socket.getOutputStream();
            output.write((account+password).getBytes());
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        socket.shutdownOutput();
        byte[] arr=new byte[200];
        InputStream input=socket.getInputStream();
        int length=input.read(arr);
        String str=new String(arr,0,length);
        System.out.println(str);
    }
}
