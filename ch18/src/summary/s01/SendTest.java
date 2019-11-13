package summary.s01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SendTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.9.233", 1122);
        Scanner sca = new Scanner(System.in);
        String number = null;
        OutputStream output = null;
        while (true) {
            try {
                number = sca.next();
                output = socket.getOutputStream();
                output.write(number.getBytes());
                output.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (number.equals("quit")) {
                break;
            }
            InputStream input = null;
            byte[] arr = new byte[200];
            try {
                input = socket.getInputStream();
                int length = input.read(arr);
                System.out.println(new String(arr, 0, length));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
