package example.e01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class E01 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("192.168.11.22",1234);
        OutputStream output=socket.getOutputStream();
        output.write("我是你爷爷".getBytes());
        socket.close();
    }
}
