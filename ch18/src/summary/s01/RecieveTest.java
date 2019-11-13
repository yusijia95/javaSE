package summary.s01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class RecieveTest {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1122);
        while (true) {
            Socket socket = server.accept();
            new Recieve(socket).start();
        }
    }
}

