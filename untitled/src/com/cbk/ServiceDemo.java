package com.cbk;

import java.util.HashSet;
import java.util.Set;

public class ServiceDemo {
    public static void main(String[] args) throws Exception {
        /*ServerSocket ss=new ServerSocket(8086);
        Socket s=ss.accept();
        InputStream is=s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println(data);

        ss.close();
        s.close();*/
        test();
    }


    public static void test(){
        Set<String> set=new HashSet<>();
        set.add("hello");
        set.add("jb");
        System.out.println(set);
    }

    void f()
    {
    }
}
class Fu
{

}
class Zi extends Fu{
    public static void main(String[] args) {

    }

}