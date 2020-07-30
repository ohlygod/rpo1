package com.cbk;

import java.net.*;

public class One {
    public static void main(String[] args) throws Exception {
        /*InetAddress address = InetAddress.getByName("localhost");
        String name=address.getHostName();
        String ip=address.getHostAddress();
        System.out.println("主机名"+name);
        System.out.println("ip地址"+ip);*/
        DatagramSocket socket=new DatagramSocket();
        byte[] bytes="fuck".getBytes();
        int length=bytes.length;
        InetAddress address=InetAddress.getByName("localhost");
        int port=8868;
        DatagramPacket packet=new DatagramPacket(bytes, length,address,port);
        socket.send(packet);
        socket.close();
    }
}
