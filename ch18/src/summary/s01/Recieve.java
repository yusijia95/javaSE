package summary.s01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Recieve extends Thread {
    Socket socket;

    public Recieve(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream input = null;
        OutputStream output = null;
        Integer number = (int) (50 * Math.random());
        byte[] arr = new byte[200];
        int length=0;
        String sendStr = null;
        String str=null;
        Integer in=null;
        while (true) {
            System.out.println(number);
            try {
                input = socket.getInputStream();
                length = input.read(arr);

            } catch (IOException e) {
                e.printStackTrace();
            }
            str = new String(arr, 0, length);
            in = new Integer(str);
            if (str.equals("quit")) {
                break;
            }
            if (in > number) {
                sendStr = "猜大了";
            } else if (in < number) {
                sendStr = "猜小了";
            } else if (in.equals(number)) {
                sendStr = "猜中了";
            }
            try {
                output = socket.getOutputStream();
                output.write(sendStr.getBytes());
                output.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
