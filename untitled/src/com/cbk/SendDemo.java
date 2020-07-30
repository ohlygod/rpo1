package com.cbk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=br.readLine())!=null)
        {
            if("886".equals(line))
                break;
            byte[] bytes=line.getBytes();
            DatagramPacket packet=new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"),8806);
            ds.send(packet);
        }
        ds.close();

    }
}
