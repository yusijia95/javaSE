package practise.p01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SendChat implements Runnable {
    DatagramSocket datagram;

    public SendChat(DatagramSocket datagram) {
        this.datagram = datagram;
    }

    @Override
    public void run() {
        while (true) {
            Scanner sca = new Scanner(System.in);
            System.out.println("请输入发送消息：");
            String message = sca.next();
            DatagramPacket packet = null;
            try {
                packet = new DatagramPacket(message.getBytes(), message.getBytes().length, InetAddress.getByName("192.168.9.233"),1122);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
            try {
                datagram.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (message.equals("88")) {
                System.out.println("白白");
                break;
            }
        }
    }
}

