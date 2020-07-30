package com.cbk;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket(InetAddress.getByName("localhost"),8086);

        OutputStream os=socket.getOutputStream();
        os.write("fuck you".getBytes());
        socket.close();
    }
}
