package practise.p01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RecieveChat implements Runnable {
    DatagramSocket datagram;

    public RecieveChat(DatagramSocket datagram) {
        this.datagram = datagram;
    }

    @Override
    public void run() {
        while (true) {
            byte [] message=new byte[200];
            DatagramPacket packet= null;
                packet = new DatagramPacket(message,200);
            try {
                datagram.receive(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            message=packet.getData();
            String mess=new String(message,0,packet.getLength());
            System.out.println(packet.getAddress()+"   "+mess);
            if(mess.equals("88")){
                break;
            }
        }
    }
}
