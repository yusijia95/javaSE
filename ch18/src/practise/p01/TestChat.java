package practise.p01;

import java.net.DatagramSocket;
import java.net.SocketException;

public class TestChat {
    public static void main(String[] args) throws SocketException {
        DatagramSocket datagram=new DatagramSocket(1122);
        SendChat send=new SendChat(datagram);
        RecieveChat recieve=new RecieveChat(datagram);
        Thread thread1=new Thread(send);
        Thread thread2=new Thread(recieve);
        thread1.start();
        thread2.start();

    }
}
