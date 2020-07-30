package com.cbk;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws Exception {
        receive1();
    }

    public static void receive1() throws Exception {
        DatagramSocket socket=new DatagramSocket(8806);
        byte[] bytes=new byte[1024];
        DatagramPacket packet=new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);

        byte[] data = packet.getData();
        String str=new String(data,0,data.length);
        System.out.println("数据是"+str);
        socket.close();
    }

    public static void receive2() throws Exception {
        DatagramSocket ds=new DatagramSocket(8868);
        byte[] bytes=new byte[1024];
        DatagramPacket packet=new DatagramPacket(bytes, bytes.length);
        byte[] data = packet.getData();
        String str=new String(data,0,data.length);
        ds.close();
    }

}
